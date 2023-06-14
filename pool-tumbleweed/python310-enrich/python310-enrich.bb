SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python310-enrich-1.2.7-3.1.noarch.rpm"
RPM_HASH = "8b4a237845b4d3f8f2673e4e9039900b9ede89ecefaaa8464b6a3ed14af9a72d2f8be1a21dc0a6ce98e3b7b502ef4d645029ec5e0682124a9bc19899eba206b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enrich \
python3.10dist-enrich \
python310-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.10dist-rich \
python310-rich"

inherit rpm
