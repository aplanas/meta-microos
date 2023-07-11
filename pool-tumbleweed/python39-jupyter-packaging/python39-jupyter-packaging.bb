SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python39-jupyter-packaging-0.12.3-2.4.noarch.rpm"
RPM_HASH = "110e78fb8a8deea5f6cab6b2d634bd80293772a471413181bbacf77c46986fee72f9946a5af334fc0d3bec51e6561a0402e885392175c42952c64de6f3a9079b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-packaging \
python39-jupyter-packaging \
python3dist-jupyter-packaging"

RDEPENDS:${PN} += "python-abi \
python39-deprecation \
python39-packaging \
python39-setuptools \
python39-tomlkit \
python39-wheel"

inherit rpm
