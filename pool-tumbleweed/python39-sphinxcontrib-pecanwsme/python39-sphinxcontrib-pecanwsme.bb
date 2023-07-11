SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-sphinxcontrib-pecanwsme-0.10.0-3.3.noarch.rpm"
RPM_HASH = "3ecfbbba1f94c34cce3ba268f937b2a54bc613202ee9edf25d38e75a2418c273c560b42b07d3de2cd7d5b1e23bcc6e1d6fad4bfdc524088c1dc5b173ada15101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinxcontrib-pecanwsme \
python39-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python39-sphinxcontrib-httpdomain"

inherit rpm
