SUMMARY = "Regex Library Supporting Different Character Encodings"
DESCRIPTION = "Oniguruma is a regular expressions library.  The characteristics of \
this library is that different character encoding for every regular \
expression object can be specified. \
 \
Supported character encodings: ASCII, UTF-8, UTF-16BE, UTF-16LE, \
UTF-32BE, UTF-32LE, EUC-JP, EUC-TW, EUC-KR, EUC-CN, Shift_JIS, Big5, GB \
18030, KOI8-R, KOI8, ISO-8859-1, ISO-8859-2, ISO-8859-3, ISO-8859-4, \
ISO-8859-5, ISO-8859-6, ISO-8859-7, ISO-8859-8, ISO-8859-9, \
ISO-8859-10, ISO-8859-11, ISO-8859-13, ISO-8859-14, ISO-8859-15, \
ISO-8859-16."
LICENSE = "BSD-2-Clause"

PV = "6.9.8"

RPM_NAME = "libonig5-6.9.8-1.5.aarch64.rpm"
RPM_HASH = "40d660de771fbf53c798da539343002f743cc00529fa4c14f8bea8a8435490373ebb25e6203731f1eaf0cde15dfaca1801da74aebbffc4d96b92f3e2bacc7c7a"

RPROVIDES:${PN} += "libonig.so.5()(64bit) \
libonig5 \
libonig5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
