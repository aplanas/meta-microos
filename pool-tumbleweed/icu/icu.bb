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

RPM_NAME = "icu-73.2-1.1.aarch64.rpm"
RPM_HASH = "1daee065ea88d3841cecd32da059b14b0da9a2a263396ff96ef8b657be5fb6d4272d1c102975251912657547e8b037309836982b21ed127a0d7be6dc33aba384"

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
