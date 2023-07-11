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

RPM_NAME = "oniguruma-devel-6.9.8-1.6.aarch64.rpm"
RPM_HASH = "95e83142cb57293137868c11538bc104147f9aa13daaae51e9c1ceb1f2ebe7716ed2cd9084fe2704a19cfafb8197dab656f5c72e674e3cd9d4956f633026097f"

RPROVIDES:${PN} += "oniguruma-devel \
pkgconfig-oniguruma"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libonig5"

inherit rpm
