SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-clipboard-2.0.3-1.2.noarch.rpm"
RPM_HASH = "db0c201bc8c0a74907f35d0a57a9ddf364c58903d1d245eb3bffaffe51b7b79d82a069b2632fcfb7dd802767b8e95117bac4264f3c60de0fc70ed9e0b78f87a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-clipboard"

RDEPENDS:${PN} += "python310-PyQt5 \
python310-QtPy \
python310-pandas"

inherit rpm
