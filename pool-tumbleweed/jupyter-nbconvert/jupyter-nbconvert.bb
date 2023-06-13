SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.3.1"

RPM_NAME = "jupyter-nbconvert-7.3.1-2.1.noarch.rpm"
RPM_HASH = "dca58f7e3d70f7885a0c45fbe9e3c60fb89ac9b38399039b1088f0fdaf66e8fbf52e74fb5f291f1e5524ff6af27ba44a56823c06713287e0c34adb605c9165d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert"

RDEPENDS:${PN} += "jupyter-ipykernel \
jupyter-jupyter-core \
python3-nbconvert"

inherit rpm
