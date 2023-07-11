SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python39-restructuredtext_lint-1.4.0-1.6.noarch.rpm"
RPM_HASH = "65dc405cb16853b74f50244bf23d1b9191e64f7d364a7bfb5975612717e619062387e23e8f69ea251e3cbc15439ab0bafde1c66bbd6824a0aef0f27c5da9c695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-restructuredtext-lint \
python39-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-docutils \
update-alternatives"

inherit rpm
