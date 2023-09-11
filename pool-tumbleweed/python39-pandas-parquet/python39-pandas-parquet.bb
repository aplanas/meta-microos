SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-parquet-2.0.3-1.3.noarch.rpm"
RPM_HASH = "2ca891771e708de0a9e36cc0345eb14b75c67e38b78779b2d3ca67988076307ed95e8672117cfeb604dc1503b0a32053c5dfce94ce07915d88153322c78d8193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-parquet"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
