SUMMARY = "Kombu actor framework"
DESCRIPTION = "Actor framework for Kombu"
LICENSE = "BSD-2-Clause"

PV = "0.0.3"

RPM_NAME = "python310-cl-0.0.3-16.5.noarch.rpm"
RPM_HASH = "6a033931545c2c6260aa1a9a7fe7e10489775d1acc7f4156701dc34d1c15131ef21297d55d8f38439b933a9b254a9ee222c8e0d62544195a2a4d30779e48e54d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cl \
python310-cl \
python3dist-cl"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-kombu \
update-alternatives"

inherit rpm
