SUMMARY = "File transport adapter for Requests"
DESCRIPTION = "Requests-File is a transport adapter for use with the Requests Python \
library to allow local filesystem access via file:// URLs."
LICENSE = "Apache-2.0"

PV = "1.5.1"

RPM_NAME = "python39-requests-file-1.5.1-2.8.noarch.rpm"
RPM_HASH = "27c0ebf52cca0458765b2bf8a889630f968536d024742e42043e62503299fe478aff9646c7c58d5e2d8f61a833bad69f38af908a3b45423d101e81c7abfc0d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-file \
python39-requests-file \
python3dist-requests-file"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
