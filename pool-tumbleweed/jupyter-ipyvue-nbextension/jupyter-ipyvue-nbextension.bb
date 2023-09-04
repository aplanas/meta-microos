SUMMARY = "Jupyter widgets base for Vue libraries - nbextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.9.2"

RPM_NAME = "jupyter-ipyvue-nbextension-1.9.2-2.1.noarch.rpm"
RPM_HASH = "0adff4062ed6e0a7eaee057455eb7b79298d675ed723fede390374951f5ea3e181c05c0270c8cff6d364cf9566fcf3a3c3c2c7b37ec071e6a0b7b425c76b848d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvue-nbextension"

RDEPENDS:${PN} += "jupyter-notebook \
python3dist-ipyvue"

inherit rpm
