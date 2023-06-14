SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python39-vim-vint-0.3.21-5.5.noarch.rpm"
RPM_HASH = "58b30de12cea9e1fc4f0dfd05a954e5a45227ddaf4ae98ead51027bdc6a17f0ced050f0c45ba1acfe41d53565adfc0e3f59b92277fb8e2dfbe58dcdc3242096c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vim-vint \
python39-vim-vint \
python3dist-vim-vint"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-ansicolor \
python39-chardet \
update-alternatives"

inherit rpm
