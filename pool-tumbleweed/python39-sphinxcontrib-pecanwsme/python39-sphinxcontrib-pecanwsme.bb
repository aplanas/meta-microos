SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-sphinxcontrib-pecanwsme-0.10.0-3.1.noarch.rpm"
RPM_HASH = "603687f28dcb61c2e0585d57af38a466e18b581943595fadb3e0ad75de606376422f4493546802af13e51174c02312b2c2a2f3cc06da678cc6f11f4f37ed583e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-pecanwsme \
python39-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python39-sphinxcontrib-httpdomain"

inherit rpm
