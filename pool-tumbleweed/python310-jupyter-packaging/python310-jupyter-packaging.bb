SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python310-jupyter-packaging-0.12.3-2.4.noarch.rpm"
RPM_HASH = "2e38fb60df9ac22fb3ba6dca1fce822d2c5e0d4993fd0ba7ffb226818572a68968e5c7dd1f26268f626b8f3e08be77ae0982909e36ea5e8c4e27ff6ebc7acbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-packaging \
python310-jupyter-packaging \
python3dist-jupyter-packaging"

RDEPENDS:${PN} += "python-abi \
python310-deprecation \
python310-packaging \
python310-setuptools \
python310-tomlkit \
python310-wheel"

inherit rpm
