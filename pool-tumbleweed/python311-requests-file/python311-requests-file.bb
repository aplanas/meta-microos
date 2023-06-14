SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python311-requests-file-1.5.1-2.8.noarch.rpm"
RPM_HASH = "9a28a49470cf106792661d76bab10dc2d4c3fc4d45f9ac26ae04a3c38982db058bda93eb58a995681e16abd0ac054ab7a433aec3efec7b117257064da41bcbe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-requests-file \
python311-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
