SUMMARY = "Python bindings for the Mailman REST API"
DESCRIPTION = "Python bindings for Mailman REST API."
LICENSE = "LGPL-3.0-only"

PV = "3.3.5"

RPM_NAME = "python311-mailmanclient-3.3.5-1.1.noarch.rpm"
RPM_HASH = "e9655ec5237652d4534787a91cb1cb8fd6fc1852dd10ddea790436c86603b833a53cc2c72d9e697ea3d512e257b265f410d85fe133465427bf37edf08f220f2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailmanclient \
python3.11dist-mailmanclient \
python311-mailmanclient \
python3dist-mailmanclient"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
