SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python310-restructuredtext_lint-1.4.0-1.6.noarch.rpm"
RPM_HASH = "6f341195dc193680c189eca0333b18102b41e21e8530045fcc684d77cdbc115e9ed27a91ea4e783b4aca78a9a697a856d8daf3341199280e067aba061262eeea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-restructuredtext-lint \
python310-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
update-alternatives"

inherit rpm
