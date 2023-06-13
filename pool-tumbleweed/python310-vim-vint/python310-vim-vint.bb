SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python310-vim-vint-0.3.21-5.5.noarch.rpm"
RPM_HASH = "d0903f749247641de47e063ab840a6b3026af24ded3d425593725816f592c56dad83adfe8383a51d2f80a7b7ebbcab498bbc5f69bbb249241b7070425cf675df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vim-vint \
python3.10dist(vim-vint) \
python310-vim-vint \
python3dist(vim-vint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-ansicolor \
python310-chardet \
update-alternatives"

inherit rpm
