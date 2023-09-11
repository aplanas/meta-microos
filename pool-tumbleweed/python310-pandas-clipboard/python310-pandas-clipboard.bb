SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-clipboard-2.0.3-1.3.noarch.rpm"
RPM_HASH = "ead168a2ed5e5398593efad611f0be9d853a58a9ceb7fdbe24b94396516b600fefd8bd7d83ca0b06332af0f55809b597b88204000ec7dc32bd6677b7b3a8a89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-clipboard"

RDEPENDS:${PN} += "python310-PyQt5 \
python310-QtPy \
python310-pandas"

inherit rpm
