SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python39-pandas-parquet-2.1.0-1.2.noarch.rpm"
RPM_HASH = "445f19bec0848bda97e42f1d4b79dd3e29c07895ab6d09fd4fcd388f26ae4246ba6ead7a05af01a9ee0dc526945135e6ef31154da0c01fe115443f339cad95bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-parquet"

RDEPENDS:${PN} += "python39-pandas \
python39-pyarrow"

inherit rpm
