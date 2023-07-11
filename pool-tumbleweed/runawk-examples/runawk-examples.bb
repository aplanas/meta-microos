SUMMARY = "Examples for RunAWK"
DESCRIPTION = "This package contains examples for RunAWK."
LICENSE = "MIT"

PV = "1.6.1"

RPM_NAME = "runawk-examples-1.6.1-1.19.noarch.rpm"
RPM_HASH = "23372ff25016120ef37279922a0743c5faad859ea82a5c9c198ef4244b4c8d68986cfe6dca0a352696b23f5a56d2edd48ef99868538364494627213e84042ca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "runawk-examples"

RDEPENDS:${PN} += "runawk"

inherit rpm
