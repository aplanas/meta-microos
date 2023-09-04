SUMMARY = "The python pandas[parquet] extra"
DESCRIPTION = "This package provides the [parquet] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-parquet-2.0.3-1.2.noarch.rpm"
RPM_HASH = "543d437e693721b35532470cf0a76c0122e5a5c0ce390ad3966c0b8e6bb88e7bc67f0a8eb7e71acd10cf4496fc35cf8f82e47d069647e21547ae6b2eb5757fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-parquet"

RDEPENDS:${PN} += "python310-pandas \
python310-pyarrow"

inherit rpm
