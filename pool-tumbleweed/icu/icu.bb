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

PV = "73.2"

RPM_NAME = "icu-73.2-2.1.aarch64.rpm"
RPM_HASH = "0b01d1471adec4efe36c2782e6f1b2f60f5cbf84decf040410ce12fa391ef50112cea72ba2baa8d3fe08cf03364b8e562cfa47f39b3bc2790b85647bfb69e99f"

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
