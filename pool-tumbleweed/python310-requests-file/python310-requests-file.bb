SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python310-requests-file-1.5.1-2.8.noarch.rpm"
RPM_HASH = "b0f5d3370b269abacedb10b25172be28ea358fafd3da274c6219d40778c26f53cab83880777b4c57e7168132e7744dee155ebbcca273f8f5c26ea5eb4d0f9aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-file \
python3.10dist(requests-file) \
python310-requests-file \
python3dist(requests-file)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
