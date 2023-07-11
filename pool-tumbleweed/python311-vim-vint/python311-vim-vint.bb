SUMMARY = "Lint tool for Vim script Language"
DESCRIPTION = "A lint tool for the Vim script Language."
LICENSE = "MIT"

PV = "0.3.21"

RPM_NAME = "python311-vim-vint-0.3.21-5.7.noarch.rpm"
RPM_HASH = "784e2475f502faa6c626f3ffe3dc5e676b632e42b3ab75415917dcc09a32dc00d116eccc6316063712703b6baaeac8a2aa7491e94ad8bf24a76c24bd0c16ef77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vim-vint \
python3.11dist-vim-vint \
python311-vim-vint \
python3dist-vim-vint"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-ansicolor \
python311-chardet \
update-alternatives"

inherit rpm
