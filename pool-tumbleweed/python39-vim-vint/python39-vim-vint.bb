SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python39-vim-vint-0.3.21-5.7.noarch.rpm"
RPM_HASH = "ceb1255ca4bb54d0b1045d87f550a63bf7c7f19baf19221c448c8e8dd6e89c41335ca21a7692f34faf7a7c3a82bae25530f6ccda6522c4b2af067f42d9455060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-vim-vint \
python39-vim-vint \
python3dist-vim-vint"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-ansicolor \
python39-chardet \
update-alternatives"

inherit rpm
