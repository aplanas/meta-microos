SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "This package supplies third-party access to the functionality of \
importlib.metadata including improvements added to subsequent Python versions."
LICENSE = "Apache-2.0"

PV = "6.8.0"

RPM_NAME = "python311-importlib-metadata-6.8.0-1.1.noarch.rpm"
RPM_HASH = "4891262b6ea7717319853b27a86ecde734a63c5156d92046c8def86861cc66111930118dafeabd92a3574401903432787d91f89c14dd1ead531bdc43cfbcfa5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-metadata \
python3.11dist-importlib-metadata \
python311-importlib-metadata \
python3dist-importlib-metadata"

RDEPENDS:${PN} += "python-abi \
python311-zipp"

inherit rpm
