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

RPM_NAME = "libonig5-6.9.8-1.6.aarch64.rpm"
RPM_HASH = "e5da99710c3b2a1434a680aa914ab3dc2a9cd5f01a2d92223bbcd680e34002aeeb70c7af00b984b917cb2cca73cde32bac86770593020e7ef7430ee295bbf7ee"

RPROVIDES:${PN} += "libonig.so.5 \
libonig5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
