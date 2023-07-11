SUMMARY = "Low Level Skeleton Library for IO Communication"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime, you can create portable code that will work \
across the supported platforms. \
 \
This package contains shared library for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "libmraa2-2.2.0-2.11.aarch64.rpm"
RPM_HASH = "85845abae28cc325fa6653c1af4c915650b0269edf06fad508a463bfe5e9894131e9de6f58504b22f84faf84b9d532bd13818a9164006002158f0bf25b0da721"

RPROVIDES:${PN} += "libmraa.so.2 \
libmraa2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5"

inherit rpm
