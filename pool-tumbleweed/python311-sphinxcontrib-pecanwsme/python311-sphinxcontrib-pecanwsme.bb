SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python311-sphinxcontrib-pecanwsme-0.10.0-3.3.noarch.rpm"
RPM_HASH = "3ff79967ca333a174590180e2c14224b3a568639b55581509497bae96be9fe9247f3dd749a47327cfd7c6dcd543763366cd380db5df45e7ffd8357515b69977b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-pecanwsme \
python3.11dist-sphinxcontrib-pecanwsme \
python311-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python311-sphinxcontrib-httpdomain"

inherit rpm
