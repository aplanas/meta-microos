SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "python39-sphinxcontrib-httpdomain-1.8.1-1.3.noarch.rpm"
RPM_HASH = "6e59511c759ee73d4df0e389a6d586dbf9f4c8e00aefa573fe8003ab4765cbf798fe09e25fc909dc3681fb5316ae60f68504bebf123e572877e02bc893aa16ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-httpdomain \
python39-sphinxcontrib-httpdomain \
python3dist-sphinxcontrib-httpdomain"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-six"

inherit rpm
