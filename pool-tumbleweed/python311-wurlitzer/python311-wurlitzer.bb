SUMMARY = "Python package to capture C-level output in context managers"
DESCRIPTION = "Wurlitzer is a python package to capture C-level \
output in context managers."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python311-wurlitzer-3.0.3-1.3.noarch.rpm"
RPM_HASH = "4ee10178b809be9a3bd5a6beb7a1c3bf8365b2071312715fdb1def2e13a3c0ba09b47f6973174ff1a457b93abe105abf3ae0f8d4d6ba7b7098c6a3d8c41a9561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-wurlitzer \
python311-wurlitzer \
python3dist-wurlitzer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
