SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python311-vim-vint-0.3.21-5.5.noarch.rpm"
RPM_HASH = "9e6b1341687f674acd330e1fa6eb45a57f72dd8b02917450241a7655d2879995a4cf851192d427436dff8a0f82ce44b2c51ed4bfa24691fcb47dba03ef5f16ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vim-vint) \
python311-vim-vint \
python3dist(vim-vint)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-ansicolor \
python311-chardet \
update-alternatives"

inherit rpm
