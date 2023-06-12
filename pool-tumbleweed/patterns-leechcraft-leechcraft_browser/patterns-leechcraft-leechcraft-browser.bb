SUMMARY = "leechcraft_browser"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_browser-20170319-1.15.aarch64.rpm"
RPM_HASH = "5f0a9e5dd26f02a80c57e0355ab4474b65ac7a2486f169e25f59d37fda1870a5a0ff50596c00914939aa0bc14c82bc2c68480ad98b8c8c43f3912bb50b0552e6"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-leechcraft-leechcraft_browser \
patterns-leechcraft-leechcraft_browser(aarch-64)"
RDEPENDS:${PN} += "leechcraft-cstp \
leechcraft-poshuku \
pattern()"

inherit rpm
