SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-deepmerge-1.1.0-1.3.noarch.rpm"
RPM_HASH = "df7834e363b7acb6df2dad60fcf0d586f3bd81afab8cb5101071504702450bb9dfd20555462fc4812e5af98eae4de64baa9854298d19afda842475d8801d68be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-deepmerge \
python39-deepmerge \
python3dist-deepmerge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
