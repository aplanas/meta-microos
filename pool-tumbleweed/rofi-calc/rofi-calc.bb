SUMMARY = "Calculator for rofi"
DESCRIPTION = "A rofi plugin that uses libqalculate's qalc to parse natural language \
input and provide results. \
 \
Since this uses libqalculate's qalc, natural language queries such as \
'500 + 25%' or '5000 EUR to USD' or '150 to hex' can be input. \
It can also solve linear equations on the fly, like '60x + 30 = 50' \
for instance."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "rofi-calc-2.2.0-1.1.aarch64.rpm"
RPM_HASH = "fecb0a69a8342865ee59580bc05bf09a3bc5f55d337dc2989c7c7c9897e8e6e3fcc085b92a250d51bcd90fb42c7fca362a9133c30223eefe5905834884ca575c"

RPROVIDES:${PN} += "rofi-calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
qalculate \
rofi-launcher"

inherit rpm
