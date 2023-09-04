SUMMARY = "Conversion of Jupyter Notebooks"
DESCRIPTION = "The jupyter nbconvert package converts notebooks to various other formats \
via Jinja templates. \
 \
This package provides the jupyter components."
LICENSE = "BSD-3-Clause & MIT"

PV = "7.7.3"

RPM_NAME = "jupyter-nbconvert-7.7.3-2.1.noarch.rpm"
RPM_HASH = "832c64128caf7498b49fdc64dcdfeec5e790e91774c37c5b56cc537051357a0797c35a654e9ba2c0f4378d11c7722bf8d4354273248be890a94e9caa5ae5d7dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-nbconvert"

RDEPENDS:${PN} += "jupyter-ipykernel \
jupyter-jupyter-core \
python3dist-nbconvert"

inherit rpm
