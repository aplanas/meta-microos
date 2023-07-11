SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-parquet-2.0.2-4.1.noarch.rpm"
RPM_HASH = "fce2d6ce072ae62d6fbb0f201ac40ecc142b1979b73466b1ae203b5097b93ab4d4f367bdc9e5722def47c474383014482f8e967f904908e4d63dec4ca6eb0c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-parquet \
python311-pandas-parquet"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
