SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-parquet-2.0.3-1.3.noarch.rpm"
RPM_HASH = "005517a84e1495f65ec33fabd698e8ca5c0a1ac8cf03d711dd1f7d833c7334e76fb9a36d0d4965c2dc1c603783c042f346a7e109cb354e35954d3fc92e478707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-parquet"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
