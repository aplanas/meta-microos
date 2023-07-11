SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python310-requests-file-1.5.1-4.1.noarch.rpm"
RPM_HASH = "7e717b11066b92081b5624ec83ac19e2b31fe76139e955c4b08f4af916c1feaf5ad42d490c0e178d6c097781cee104bd4810535341006b563d86f0a0777563d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-file \
python310-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
