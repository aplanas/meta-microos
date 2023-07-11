SUMMARY = "Utility to import docs into a gh-pages branch"
DESCRIPTION = "A utility to import docs to a gh-pages branch. \
This will destroy the gh-pages branch. This script assumes that \
gh-pages is 100% derivative. You should never edit files in your \
gh-pages branch by hand if you're using this script because you \
will lose your work."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python310-ghp-import-2.1.0-3.1.noarch.rpm"
RPM_HASH = "ce8dda4266fbbc0b7c1f82e4f2cd8c3e52fd0fd64e005abe27c78590f57d771279dce94ab2ca18afcf5c3844b9ab24cd1cba08652bfb845b75a8ad15936a338d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ghp-import \
python310-ghp-import \
python3dist-ghp-import"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dateutil \
update-alternatives"

inherit rpm
