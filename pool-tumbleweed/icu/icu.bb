SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode and locale \
support, such as calendar, conversions for many character sets, language \
sensitive collation, date and time formatting, support for many locales, \
message catalogs and resources, message formatting, normalization, number and \
currency formatting, time zone support, transliteration, and word, line, and \
sentence breaking. \
 \
This subpackage contains the runtime programs for interacting with ICU."
LICENSE = "ICU"

PV = "73.1"

RPM_NAME = "icu-73.1-1.1.aarch64.rpm"
RPM_HASH = "d32b96c37f2e3159b480c2c54401dfce06226e25a29c2eeacab5855ac4e0e75a5cf4d53807d487d045b5e15339df66165ee7c50472a94162f4410333c14368ab"

RPROVIDES:${PN} += "bundled-timezone \
icu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuio.so.73 \
libicutu.so.73 \
libicuuc.so.73 \
libstdc++.so.6"

inherit rpm
