SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-parquet-2.0.3-1.2.noarch.rpm"
RPM_HASH = "ea53eef21d66228be525689b62557710f749107b2e11f61918b2448d8bb53cf8363b438d5c90693808a0de3f99b04105b9f713c29611e5b60bdfccd11ae8ec52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-parquet \
python311-pandas-parquet"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
