SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-parquet-2.1.0-1.2.noarch.rpm"
RPM_HASH = "8fd4baba40351c12a1ffc43225555baaf6c8dd53edbef38467fcd48813d4ebb09952c7625862082e8c18a30f2dd50ecbea90f3e75f035b2bb28d4b1d9700c3ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-parquet \
python311-pandas-parquet"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
