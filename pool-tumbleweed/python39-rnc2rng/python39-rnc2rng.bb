SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "python39-rnc2rng-2.6.6-1.11.noarch.rpm"
RPM_HASH = "97f1099fbaded8c12f50a75841bc58d57e913b6030b38b27ceba6e83a93a7384fc376acc746c58a024aadd26a63e25ab7be88e2a7c7a553d21cad8833d28505c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rnc2rng \
python39-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-rply \
update-alternatives"

inherit rpm
