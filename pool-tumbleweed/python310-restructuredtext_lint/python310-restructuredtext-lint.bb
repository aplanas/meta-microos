SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python310-restructuredtext_lint-1.4.0-1.4.noarch.rpm"
RPM_HASH = "5b3f8ad2ce2858a6aa0ca68deaaaa9158fb28d33b6956795d890b2daded81a2a8c54879ceb5ba739c5c74d357b602202648eaa12943a443c6a5dbcc25a55c016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-restructuredtext-lint \
python3.10dist-restructuredtext-lint \
python310-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
update-alternatives"

inherit rpm
