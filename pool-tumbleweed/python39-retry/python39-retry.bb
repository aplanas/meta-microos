SUMMARY = "Python retry decorator"
DESCRIPTION = "Easy to use retry decorator."
LICENSE = "Apache-2.0"

PV = "0.9.2"

RPM_NAME = "python39-retry-0.9.2-3.8.noarch.rpm"
RPM_HASH = "b242e7dcc286003ae7764a1ee91fe78be1d243fd25f813f88fc6d0af4ab03744dadc73c8b18620c1e20747a95c651caecc81ec1b3f3c9ab24ef79ee40ddcfe62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-retry \
python39-retry \
python3dist-retry"

RDEPENDS:${PN} += "python-abi \
python39-decorator \
python39-py"

inherit rpm
