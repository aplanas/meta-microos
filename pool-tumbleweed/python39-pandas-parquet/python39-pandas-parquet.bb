SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-parquet-2.0.3-1.2.noarch.rpm"
RPM_HASH = "7913aa7d21619686dc15c20e5e2f05a0b3b3d830a3dff441dd7113097cc4d229b1083fbad214f0906b59bbcbc02175a4992046396ce24c4e63cdd23d433758c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-parquet"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
