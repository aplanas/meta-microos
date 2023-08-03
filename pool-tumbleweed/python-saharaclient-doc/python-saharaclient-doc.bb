SUMMARY = "Documentation for Client library for OpenStack Sahara API"
DESCRIPTION = "Python client library for interacting with OpenStack Sahara API."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python-saharaclient-doc-3.5.0-1.7.noarch.rpm"
RPM_HASH = "3040dc9615e3eb1e64848f84da144dfbe1f1dc9d4e5e66ae5fe448d18a3c38d03697698dcde68b8ebc2443c65ac20a826ab9c4742678a13ca8243b1e303d29a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-saharaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
