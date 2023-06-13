SUMMARY = "Examples for RunAWK"
DESCRIPTION = "This package contains examples for RunAWK."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "runawk-examples-1.6.1-1.18.noarch.rpm"
RPM_HASH = "8f009474a9182ffd63dc031de17db66b051c300f8c705b7df6fcad5889415fbdeb68608e8bd8310312f78f905bec277275fe486afdd0f3e5285b95e904126a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "runawk-examples"

RDEPENDS:${PN} += "runawk"

inherit rpm
