SUMMARY = "Scales for Python"
DESCRIPTION = "Mizani is a scales package for graphics."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python311-mizani-0.8.1-1.4.noarch.rpm"
RPM_HASH = "29afcb93786bda2b72ca4172cf9c9ca78e1170aa121fe46db5e1fa020994271657d9793cc246339287667fadfa70f685ce9a15fc7d4ca9ffb7c81e5537f903f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mizani \
python3.11dist-mizani \
python311-mizani \
python3dist-mizani"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-numpy \
python311-palettable \
python311-pandas \
python311-scipy"

inherit rpm
