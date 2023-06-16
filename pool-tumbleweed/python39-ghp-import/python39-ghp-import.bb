SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python39-ghp-import-2.1.0-2.3.noarch.rpm"
RPM_HASH = "ac6216f23119e4dad0ddcb37558b99d3fd400f2ff76cf9bb03cbe125852655d90435c59948d42961ce62192222069a10a502fbc6b681fc5553669494f48d7726"
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
