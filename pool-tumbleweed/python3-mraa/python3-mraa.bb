SUMMARY = "Python3 bindings for mraa"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime, you can create portable code that will work \
across the supported platforms. \
 \
This package contains python3 bindings for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python3-mraa-2.2.0-2.11.aarch64.rpm"
RPM_HASH = "4784f0811f8e5b14c087150e0099da1a4f3072c06e2f96d1a4f1dd003ee2d54f7d347563156606cc719232cf2845349db843ca4bd410d73b7cf99b70eeda538b"

RPROVIDES:${PN} += "python3-mraa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmraa.so.2 \
libmraa2 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
