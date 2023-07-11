SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python311-requests-file-1.5.1-4.1.noarch.rpm"
RPM_HASH = "ed18a2d2adf7cab7ddfd17fb2d199ac7e69c6ae85a2272894f8318addfa44a24573a8a7bff1f0ae6e316d43971ff8a393e9f02fb7c072c4f427b95a9aec69360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-file \
python3.11dist-requests-file \
python311-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
