SUMMARY = "leechcraft_utilities"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_utilities-20170319-1.15.aarch64.rpm"
RPM_HASH = "085904eb1b2ac94fdef29c15868a63bb5141380700d20534a90d3db9d739a764815b5d051fa31ec06e8529fcb38ce5c464718d57c935c44b7c65389b5b121575"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
patterns-leechcraft-leechcraft_utilities \
patterns-leechcraft-leechcraft_utilities(aarch-64)"
RDEPENDS:${PN} += "leechcraft \
pattern()"

inherit rpm
