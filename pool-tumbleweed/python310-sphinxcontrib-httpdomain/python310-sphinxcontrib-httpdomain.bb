SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "python310-sphinxcontrib-httpdomain-1.8.1-1.1.noarch.rpm"
RPM_HASH = "91e6521e6ed572f39b8ddc380e28a39dead395129afc08a8b8d9fd454d0efb378fca7efab74de54b797e157a95591e0668bb8b284bafe60df0e33389dd6017c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-httpdomain \
python3.10dist-sphinxcontrib-httpdomain \
python310-sphinxcontrib-httpdomain \
python3dist-sphinxcontrib-httpdomain"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx \
python310-six"

inherit rpm
