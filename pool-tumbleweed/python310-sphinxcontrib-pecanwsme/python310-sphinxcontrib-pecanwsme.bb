SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-sphinxcontrib-pecanwsme-0.10.0-3.1.noarch.rpm"
RPM_HASH = "5a59749b9ba1da1ad9e0f34ea58894b4f484077118a1b39aa5d2f3e81de277cf823bcab53e2f113df9f9aa70411cde9a26f9ccfcd4cc4f69985aad78adaaf825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-pecanwsme \
python3.10dist-sphinxcontrib-pecanwsme \
python310-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python310-sphinxcontrib-httpdomain"

inherit rpm
