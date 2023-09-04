SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-compression-2.0.3-1.2.noarch.rpm"
RPM_HASH = "d1ff78de6dcaa68b72f5281bd4ca8ae8966589fccb9ad479f21bc0507d81de42481ad707d9035f942c6a33f53bbf0fbbe6f68ec9c6d11d10ff711e5ce2cfec96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-compression"

RDEPENDS:${PN} += "python310-brotlipy \
python310-pandas \
python310-python-snappy \
python310-zstandard"

inherit rpm
