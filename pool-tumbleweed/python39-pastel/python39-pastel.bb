SUMMARY = "String colorization for Python"
DESCRIPTION = "Pastel is a library to colorize strings in the terminal."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python39-pastel-0.2.1-1.5.noarch.rpm"
RPM_HASH = "fc40a4716cace6eb39294fd061b4378baac44509117cf3476cacba4df5b17bc790446a2038278ba035f85e00e97f4b5348ea4928c4c5402806c8e37c56e5831c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pastel) \
python39-pastel \
python3dist(pastel)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
