SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-ghp-import-2.1.0-3.1.noarch.rpm"
RPM_HASH = "f613dd73897ea6ae805df4a44141ba8e1155b5057e70afdd118a9c1cc4248d03aea2ff6d256b9ababa5b4072dab31c202432e86a4675a6121556ce1021fe77cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ghp-import \
python39-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dateutil \
update-alternatives"

inherit rpm
