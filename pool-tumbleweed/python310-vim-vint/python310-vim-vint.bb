SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python310-vim-vint-0.3.21-5.7.noarch.rpm"
RPM_HASH = "d0c3a1db0c215b30141cb96a77f137ec9f1723b4a4f61b2c2f6fa578ee2a4b39e523a622a9ecef238dbcfca5a57ff0447199b7533c9b4bf15924512a7b59fd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-vim-vint \
python310-vim-vint \
python3dist-vim-vint"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-ansicolor \
python310-chardet \
update-alternatives"

inherit rpm
