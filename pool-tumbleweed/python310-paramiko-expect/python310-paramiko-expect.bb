SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python310-paramiko-expect-0.3.5-1.3.noarch.rpm"
RPM_HASH = "6b6cd0bfaeb85b992c34ce7572e54e7139c22585945d6cfa1b0eae58c4a5894fb59de000e49ad5dead3eba1a1dca7cd8c7a2c420a3e43f88a5d538217e921863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-paramiko-expect \
python310-paramiko-expect \
python3dist-paramiko-expect"

RDEPENDS:${PN} += "python-abi \
python310-paramiko"

inherit rpm
