SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python310-jupyter-packaging-0.12.3-2.2.noarch.rpm"
RPM_HASH = "c0541ba7459d5b45375847c2555f49ca982e5aa257fcaed6511fa4dddd0358ebd449ff68a23723fe62daa4ca4204afe9801c6798b03efd8d81c912253383f4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-packaging \
python3-jupyter_packaging \
python3.10dist(jupyter-packaging) \
python310-jupyter-packaging \
python310-jupyter_packaging \
python3dist(jupyter-packaging)"
RDEPENDS:${PN} += "python(abi) \
python310-deprecation \
python310-packaging \
python310-setuptools \
python310-tomlkit \
python310-wheel"

inherit rpm
