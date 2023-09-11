SUMMARY = "The python pandas[test] extra"
DESCRIPTION = "This package provides the [test] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-test-2.0.3-1.3.noarch.rpm"
RPM_HASH = "fdac00d6746c671e0c07a55807101b1f90fda48918b1de9faaaa6b1e0745a7d2da8b76bce7fd8e5722026e3e1a3e8b42bda35a7ee89280012adce50b423d8c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-test"

RDEPENDS:${PN} += "python310-hypothesis \
python310-pandas \
python310-pytest \
python310-pytest-asyncio \
python310-pytest-xdist"

inherit rpm
