SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-compression-2.0.3-1.3.noarch.rpm"
RPM_HASH = "99f5b6fec89afc36ea3c0efcadabe652fce3ea986a5d4d60e8c1fad90c4bfe84f64d58f28c0999eb2e1865fe6abbefb7a31fbf99ce4eeea3740566fa7728b540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-compression \
python311-pandas-compression"

RDEPENDS:${PN} += "python311-brotlipy \
python311-pandas \
python311-python-snappy \
python311-zstandard"

inherit rpm
