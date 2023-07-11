SUMMARY = "Sphinx contrib extension to generate html help files"
DESCRIPTION = "Html help generating extension."
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python311-sphinxcontrib-htmlhelp-2.0.1-2.3.noarch.rpm"
RPM_HASH = "d1d0acbcfc6780036e1223b7f4893fe03cf328ab8e75e1321861ec2f7dadedf3faf33f2ce15fd2e86e4147ed595cd36ab9baf680db0c68ec6adc3977ae0f8e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-htmlhelp \
python3.11dist-sphinxcontrib-htmlhelp \
python311-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx"

inherit rpm
