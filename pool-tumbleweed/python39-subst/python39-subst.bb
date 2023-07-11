SUMMARY = "Utility to replace one string into another in given list of files"
DESCRIPTION = "`subst` is simple utility to replace one string into another in given list of files."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python39-subst-0.4.0-3.17.noarch.rpm"
RPM_HASH = "9df4e518cc77050eb3b0fde2d8d1233ec474792444d29335318bdd382d8e8f068e5f3bd6d26efe50275f79eed79601e0a9aae59b3e4cde1784456eb939893918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-subst \
python39-subst \
python3dist-subst"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
