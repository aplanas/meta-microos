SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-clipboard-2.0.2-4.1.noarch.rpm"
RPM_HASH = "a5155183d0cdc69c5e71f8ece9b70af28d6e5f4f73065371bab69abf03e6181b29b0b2af754ac40201d2625a25f904608ead5ab4e6a3c50d7db0e9fe907555fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-clipboard"

RDEPENDS:${PN} += "python310-PyQt5 \
python310-QtPy \
python310-pandas"

inherit rpm
