SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-parquet-2.1.0-1.2.noarch.rpm"
RPM_HASH = "96c65be712f862a04cbbc0fc0af2a8c66fe1c968c65e3ea3f7ffa19139cd9229ca2daa0ebf4c8619af2b02cb2210e0ec7fdc2f47642f4293cbd9e760d27b9d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-parquet"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
