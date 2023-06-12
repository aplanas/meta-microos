SUMMARY = "leechcraft_netutils"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_netutils-20170319-1.15.aarch64.rpm"
RPM_HASH = "af8f4846727e3949240a9220280943b37ac5ec88e4d538f395af13b29596145ef69055f8e65cd694f1ce917444748675406507e97080fa08027397283f5cf2ee"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-leechcraft-leechcraft_netutils \
patterns-leechcraft-leechcraft_netutils(aarch-64)"
RDEPENDS:${PN} += "leechcraft-cstp \
pattern()"

inherit rpm
