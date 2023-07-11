SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python39-requests-file-1.5.1-4.1.noarch.rpm"
RPM_HASH = "962e50a95bf82a218c5f7ab13352bef7ba950809282143071c09d7b3efcde7933d0d92ba7c02c800fe0a04cef15c0377bf181f81a637a5666959beedb05e7154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-file \
python39-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
