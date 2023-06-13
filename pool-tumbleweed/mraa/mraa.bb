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

RPM_NAME = "mraa-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "05f8e4c91164a1a2d2dcf79047981af2ba71b6ef5865ad2e73d6a7df6c2abf1b88092a26b1b4ad76952b8dcd3f18efa27929115778115e632efb4ab2f56592e6"

RPROVIDES:${PN} += "mraa \
mraa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libmraa.so.2()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
