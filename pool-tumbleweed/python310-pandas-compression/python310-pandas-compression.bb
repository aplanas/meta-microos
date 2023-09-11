SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-compression-2.0.3-1.3.noarch.rpm"
RPM_HASH = "ba3d20382e93b08617f978bc55be594a5078d273f96eb817926a0232d54d3b00c5c2f5723fb2f62e896af358de69df4ac9461127cc1e79f91dd9da9942aac16d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-compression"

RDEPENDS:${PN} += "python310-brotlipy \
python310-pandas \
python310-python-snappy \
python310-zstandard"

inherit rpm
