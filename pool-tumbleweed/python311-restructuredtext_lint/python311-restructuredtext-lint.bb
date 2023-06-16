SUMMARY = "Linter for reStructuredText"
DESCRIPTION = "Linter for reStructuredText. \
 \
This was created out of frustration with PyPI; it sucks finding out \
your reST is invalid **after** uploading it. It is being developed \
in junction with a Sublime Text linter."
LICENSE = "Unlicense"

PV = "1.4.0"

RPM_NAME = "python311-restructuredtext_lint-1.4.0-1.4.noarch.rpm"
RPM_HASH = "aa6c04665a0e1c97238734fe0051196dd16caeb76c74374bd3837740c68773e4286a8b3ba76e6cfe97b93c83cec0ec144b2f0fb6f3deee798e283becc4170372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-restructuredtext-lint \
python311-restructuredtext-lint \
python3dist-restructuredtext-lint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
update-alternatives"

inherit rpm
