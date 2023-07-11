SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "1.0.3"

RPM_NAME = "python311-sphinxcontrib-qthelp-1.0.3-3.2.noarch.rpm"
RPM_HASH = "8524c8e47bc4466e58f3e14aa0e1b0895f07c48aae395dc30a42d4a983d880d8cd350fc8fab4bfb34bfa6dcbaa945dd4365f0ecf02f4ff6c894f6389b0c7e97e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-qthelp \
python3.11dist-sphinxcontrib-qthelp \
python311-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
