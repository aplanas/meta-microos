SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python39-jupyter-packaging-0.12.3-2.2.noarch.rpm"
RPM_HASH = "45ef6464c7384b96eab4516c2bca84b514e5e7cd646de396f244400c0ca580eaa4fa4b581caa7d9bb555fd260fe353a29842094a66d3ece45c8b6bfe0c91d57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jupyter-packaging) \
python39-jupyter-packaging \
python39-jupyter_packaging \
python3dist(jupyter-packaging)"

RDEPENDS:${PN} += "python(abi) \
python39-deprecation \
python39-packaging \
python39-setuptools \
python39-tomlkit \
python39-wheel"

inherit rpm
