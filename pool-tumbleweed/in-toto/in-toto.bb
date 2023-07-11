SUMMARY = "in-toto is a framework to protect supply chain integrity."
DESCRIPTION = "in-toto provides a framework to protect the integrity of the software supply chain. It does so by verifying that each task in the chain is carried out as planned, by authorized personnel only, and that the product is not tampered with in transit."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "in-toto-1.2.0-1.6.noarch.rpm"
RPM_HASH = "174662e1359e0e25ce1ee94e7759a6290881b2c14d7e7dbe6454eb6c313eca39e013ab3b3ccacd6494e2863ad49962cbf2d81d615a2934d250941c7083e70b20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "in-toto \
python3.11dist-in-toto \
python3dist-in-toto"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-attrs \
python3-iso8601 \
python3-pathspec \
python3-python-dateutil \
python3-securesystemslib"

inherit rpm
