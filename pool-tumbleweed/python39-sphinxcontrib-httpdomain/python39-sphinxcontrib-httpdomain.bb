SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "python39-sphinxcontrib-httpdomain-1.8.1-1.1.noarch.rpm"
RPM_HASH = "d01990c92699dcc99616562b5358502f53c7e8e8b31bdf732a5c5c34920f089e1b2c8048b242e68b8a87a0434699a331657d0876c266b30190a355650368f6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinxcontrib-httpdomain) \
python39-sphinxcontrib-httpdomain \
python3dist(sphinxcontrib-httpdomain)"

RDEPENDS:${PN} += "python(abi) \
python39-Sphinx \
python39-six"

inherit rpm
