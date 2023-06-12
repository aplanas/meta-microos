SUMMARY = "Documentation for OpenStack authenticating tools"
DESCRIPTION = "Documentation for OpenStack authenticating tools."
LICENSE = "Apache-2.0"

PV = "5.1.2"

RPM_NAME = "python-keystoneauth1-doc-5.1.2-1.2.noarch.rpm"
RPM_HASH = "31bd1b02f1e55b04a4c5505e5f6d40c448290e4511bddd1ddd58d53448b5ce7509d0e0e6b64e30bc8fe173543b4f3b6318a407c48f7f369b1372a962ffffd212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-keystoneauth1-doc"
RDEPENDS:${PN} += ""

inherit rpm
