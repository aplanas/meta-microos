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

RPM_NAME = "libmraa2-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "b1040db0c21d5c5312c975953b13c618f983dd43eaa2488cb1f8d7adae6b6c5bb0988ccd7271a6555cc65bcd4c544dcddf659b95e8a9e9828ae94b5bc6c41c2b"

RPROVIDES:${PN} += "libmraa.so.2()(64bit) \
libmraa2 \
libmraa2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libjson-c.so.5()(64bit)"

inherit rpm
