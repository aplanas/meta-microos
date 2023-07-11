SUMMARY = "Low Level Skeleton Library for IO Communication"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured and sane API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware with board \
detection done at runtime you can create portable code that will work \
across the supported platforms. \
 \
The intent is to make it easier for developers and sensor manufacturers to \
map their sensors & actuators on top of supported hardware and to allow \
control of low level communication protocol by high level languages & \
constructs."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "mraa-2.2.0-2.11.aarch64.rpm"
RPM_HASH = "c8c541f725993114cc5c571b3a4ba4f6811006fe248c2ee301f0070b1eb8deaf02d975e7a0996d5037d9585f3ba6567cada1c5688e3ac9507fa033a0bebbd663"

RPROVIDES:${PN} += "mraa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libmraa.so.2 \
libudev.so.1"

inherit rpm
