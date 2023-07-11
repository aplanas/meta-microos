SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python311-jupyter-packaging-0.12.3-2.4.noarch.rpm"
RPM_HASH = "fef775a34879df65e73b76edfda403263f47771f5e36c9d0f8695e5f079a1e7a82289ba7579e8913d47c9c117f213c0bb27b5312f30013e48333b93abeaf9908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-packaging \
python3.11dist-jupyter-packaging \
python311-jupyter-packaging \
python3dist-jupyter-packaging"

RDEPENDS:${PN} += "python-abi \
python311-deprecation \
python311-packaging \
python311-setuptools \
python311-tomlkit \
python311-wheel"

inherit rpm
