SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python311-daiquiri-3.2.1-1.3.noarch.rpm"
RPM_HASH = "7593aefa0bbe41dd9298a0363ce4723550fc059fbccbccd442f371cce5d1b9f855facedf41ae2af2b173b8fa426db1308fa1de2e5b0c3d2a714c8d324453e724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(daiquiri) \
python311-daiquiri \
python3dist(daiquiri)"

RDEPENDS:${PN} += "python(abi) \
python311-python-json-logger"

inherit rpm
