SUMMARY = "A high level imperative/OO programming language"
DESCRIPTION = "Squirrel is a programming language featuring higher-order functions, \
classes, inheritance, delegation, tail recursion, generators, \
cooperative threads, exception handling, reference counting, garbage \
collection on demand, and a C-like syntax."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-3.2-2.3.aarch64.rpm"
RPM_HASH = "a1289e2856a8a333b14630de00e4b5c6b6dc1d9686d13994675222a4bc83dc4da7e4c143c95b715de21116086feaad43ed549b2648b35c9434f25fa9f8f5d6c6"

RPROVIDES:${PN} += "squirrel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqstdlib3.so.1001 \
libsquirrel3.so.1001"

inherit rpm
