SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python39-restructuredtext_lint-1.4.0-1.4.noarch.rpm"
RPM_HASH = "7fabc5ad77bb66915a7cf69ecc5d10310c232fbc81f59934edd67f57c9d784b4d4e10f93dd4b2d2fd2e506dce53f04ce479899e38d97b5c963063661a9cee592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(restructuredtext-lint) \
python39-restructuredtext_lint \
python3dist(restructuredtext-lint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-docutils \
update-alternatives"

inherit rpm
