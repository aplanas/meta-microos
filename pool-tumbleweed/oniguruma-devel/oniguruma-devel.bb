SUMMARY = "Regex Library Supporting Different Character Encodings - Development Files"
DESCRIPTION = "Oniguruma is a regular expressions library.  The characteristics of \
this library is that different character encoding for every regular \
expression object can be specified. \
 \
Supported character encodings: ASCII, UTF-8, UTF-16BE, UTF-16LE, \
UTF-32BE, UTF-32LE, EUC-JP, EUC-TW, EUC-KR, EUC-CN, Shift_JIS, Big5, GB \
18030, KOI8-R, KOI8, ISO-8859-1, ISO-8859-2, ISO-8859-3, ISO-8859-4, \
ISO-8859-5, ISO-8859-6, ISO-8859-7, ISO-8859-8, ISO-8859-9, \
ISO-8859-10, ISO-8859-11, ISO-8859-13, ISO-8859-14, ISO-8859-15, \
ISO-8859-16. \
 \
This package contains all necessary include files and libraries needed to \
develop applications that require it."
LICENSE = "BSD-2-Clause"

PV = "6.9.8"

RPM_NAME = "oniguruma-devel-6.9.8-1.5.aarch64.rpm"
RPM_HASH = "0cff3705d5a65ec3f1734c169670ce4cf6e080a4d7c2b28d79bcc3242254e8459ba951108927ecb8fc7f07d6e1a4ff0959237e153b72c6879df0c372d6693743"

RPROVIDES:${PN} += "oniguruma-devel \
oniguruma-devel(aarch-64) \
pkgconfig(oniguruma)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libonig5"

inherit rpm
