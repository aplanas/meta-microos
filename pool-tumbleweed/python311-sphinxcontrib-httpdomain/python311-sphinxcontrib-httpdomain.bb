SUMMARY = "Sphinx domain for HTTP APIs"
DESCRIPTION = "This contrib extension, sphinxcontrib.httpdomain provides a Sphinx \
domain for describing RESTful HTTP APIs. \
 \
You can find the documentation from the following URL: \
 \
https://sphinxcontrib-httpdomain.readthedocs.io/en/stable/"
LICENSE = "BSD-2-Clause"

PV = "1.8.1"

RPM_NAME = "python311-sphinxcontrib-httpdomain-1.8.1-1.3.noarch.rpm"
RPM_HASH = "c976e115a9bafe61322d619310a9503a8030e7f5c338f5aaafc6e4d5292a7531473e12b3da7e42ba27e000b815921551be7553febcf0250a7da82300ee890c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-httpdomain \
python3.11dist-sphinxcontrib-httpdomain \
python311-sphinxcontrib-httpdomain \
python3dist-sphinxcontrib-httpdomain"

RDEPENDS:${PN} += "python-abi \
python311-Sphinx \
python311-six"

inherit rpm
