SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python311-ghp-import-2.1.0-3.1.noarch.rpm"
RPM_HASH = "62a123564fbf4fc6c9c282e59bf57578b12fff506ce4a2b40dcaca05e83ffc19bd9fa01e2c6c255df47aefceec3d4229f6337c3626b5791586b17d46e806daf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ghp-import \
python3.11dist-ghp-import \
python311-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dateutil \
update-alternatives"

inherit rpm
