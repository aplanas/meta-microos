SUMMARY = "PEM file parsing in Python"
DESCRIPTION = "pem is a Python module for parsing and splitting of PEM files, \
i.e. Base64 encoded DER keys and certificates."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python311-pem-21.2.0-2.1.noarch.rpm"
RPM_HASH = "93886c7dbcc3d861d190d46f5a9dd628b89be09c78de2ebdec3ed5b8767f6c16ce0fcce0c2ac53ad0603295e768c7cc9629fd7eaf1ac76b9b31b5b4bc7d8f7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pem \
python3.11dist-pem \
python311-pem \
python3dist-pem"

RDEPENDS:${PN} += "python-abi"

inherit rpm
