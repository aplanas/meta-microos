SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "python310-sphinxcontrib-httpdomain-1.8.1-1.3.noarch.rpm"
RPM_HASH = "c3f1d616312d5e14d0cbdebca157336281c697087082548379835024e63c30fd53e6390b33cb22c739aa572b92150a2ea9680678cfc4216aacf7c8cf21a81c1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinxcontrib-httpdomain \
python310-sphinxcontrib-httpdomain \
python3dist-sphinxcontrib-httpdomain"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-six"

inherit rpm
