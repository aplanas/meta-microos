SUMMARY = "Documentation for Client library for OpenStack Sahara API"
DESCRIPTION = "Python client library for interacting with OpenStack Sahara API."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python-saharaclient-doc-3.5.0-1.6.noarch.rpm"
RPM_HASH = "9b100c11c4db3138420072f1885a525abb66f27374cd74c8590fc8d16c91569cb40ac9b2d3f4f6c3d044519e352162a62ab893064b030bd628b13003ca014ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-saharaclient-doc"
RDEPENDS:${PN} += ""

inherit rpm
