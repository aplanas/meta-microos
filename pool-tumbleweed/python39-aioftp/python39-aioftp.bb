SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.21.4"

RPM_NAME = "python39-aioftp-0.21.4-2.5.noarch.rpm"
RPM_HASH = "e2181b225812d13cc8cc25fa7bb18f25974232a9b3809dda17718023484256a9bde735282d43371cd68466f01969e688dc675c3fdd97671dbdefdc6632a41d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aioftp \
python39-aioftp \
python3dist-aioftp"

RDEPENDS:${PN} += "python-abi \
python39-siosocks"

inherit rpm
