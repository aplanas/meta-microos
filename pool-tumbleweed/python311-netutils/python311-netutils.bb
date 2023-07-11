SUMMARY = "Common helper functions useful in network automation"
DESCRIPTION = "A Python library that is a collection of objects for common network automation tasks."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python311-netutils-1.4.1-1.3.noarch.rpm"
RPM_HASH = "a19fabfe4419f638b7a6cfd53c248a64a91fad855a18a1b00c083a0e664192db031773ed9dafe24daac9b6b62003b93a0b07b7e303d52b51b8b585acd6eb5fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-netutils \
python3.11dist-netutils \
python311-netutils \
python3dist-netutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
