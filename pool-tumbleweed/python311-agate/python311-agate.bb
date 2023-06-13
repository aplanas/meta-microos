SUMMARY = "Data analysis library optimized for humans instead of machines"
DESCRIPTION = "Agate is a Python data analysis library that is optimized for humans \
instead of machines. It is an alternative to numpy and pandas that \
solves real-world problems with readable code. \
 \
Agate was previously known as journalism."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "python311-agate-1.7.1-2.2.noarch.rpm"
RPM_HASH = "fc4b8b88ab063e8ecd978f81d3a0128aedeed508d12d3a6082d3f31e8ce6f92735f86054e3afd51f98fc18f99db5619af341ee43851f7d09ac900af3d73e1468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(agate) \
python311-agate \
python3dist(agate)"

RDEPENDS:${PN} += "python(abi) \
python311-Babel \
python311-isodate \
python311-leather \
python311-parsedatetime \
python311-python-slugify \
python311-pytimeparse"

inherit rpm
