SUMMARY = "Fastest Python implementation of JSON schema"
DESCRIPTION = "Fastest Python implementation of JSON schema"
LICENSE = "BSD-3-Clause"

PV = "2.17.1"

RPM_NAME = "python311-fastjsonschema-2.17.1-1.3.noarch.rpm"
RPM_HASH = "9125fee60c53f0d44507f76e50c1251ef7468429874524abe92377278795bf0906c9c582426d6b9bb89eb244c1714a83a2faa81983c86ee215f83ac5a2380d18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastjsonschema \
python3.11dist-fastjsonschema \
python311-fastjsonschema \
python3dist-fastjsonschema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
