SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python311-restructuredtext_lint-1.4.0-1.6.noarch.rpm"
RPM_HASH = "8979227134e490d5309644e7ed567cb2b7fb0b75e87c1156eb2e88e13882ed75891fb8ca579a22ac1127d980f5b6bee3450b90922870b3c0c58bde75d8368395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-restructuredtext-lint \
python3.11dist-restructuredtext-lint \
python311-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
update-alternatives"

inherit rpm
