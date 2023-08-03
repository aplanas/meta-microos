SUMMARY = "Jupyter widgets base for Vue libraries - nbextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "jupyter-ipyvue-nbextension-1.9.2-1.2.noarch.rpm"
RPM_HASH = "87d0f22035f5cd0810c98ae2e8ce7e39000eae2efa0cda865ed11a0c684d03d59599297f652c94d0ba183fcac0309da61b029b2bca5b7ac8ce171cd6470f79bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvue-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvue"

inherit rpm
