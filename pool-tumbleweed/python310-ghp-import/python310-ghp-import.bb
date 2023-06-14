SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-ghp-import-2.1.0-2.3.noarch.rpm"
RPM_HASH = "ea0c809f38606502c1584e87bd78cb71b287c72099b48c656be011859f63afcd045247939324118eb5d21f24076ca170a16ef592b792b86270d598ad833f1771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ghp-import \
python3.10dist-ghp-import \
python310-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-dateutil \
update-alternatives"

inherit rpm
