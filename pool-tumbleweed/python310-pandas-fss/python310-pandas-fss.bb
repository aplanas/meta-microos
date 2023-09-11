SUMMARY = "The python pandas[fss] extra"
DESCRIPTION = "This package provides the [fss] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-fss-2.0.3-1.3.noarch.rpm"
RPM_HASH = "55c84ae762c1607e95acfd5ddec23fa16fa5555640e732e23e713f779a8022a1cfd17f22c4b327a9b85e969e0bdb69e7186db24c25090c1703548877552a1fae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-fss"

RDEPENDS:${PN} += "python310-fsspec \
python310-pandas"

inherit rpm
