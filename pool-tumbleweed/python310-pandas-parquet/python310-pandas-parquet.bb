SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-parquet-2.0.2-4.1.noarch.rpm"
RPM_HASH = "a9d4f1434ced6e0f7674964106e0986bc84599e223e91d5c25de7305f225e98f3c8713855cd29ea991ae2737bbbce8dd5015b5eb8817c8a516400b7b39de00da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-parquet"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
