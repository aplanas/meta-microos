SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python310-paramiko-expect-0.3.5-1.1.noarch.rpm"
RPM_HASH = "632903a2fac6640048e5e7df29b9862a2c905e17634d955cca8e00ac31289ef9e5c511ceedfda629e55bc02ff0e54ef1e2a89c965303c8ab68075fce6f2a7850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko-expect \
python3.10dist-paramiko-expect \
python310-paramiko-expect \
python3dist-paramiko-expect"

RDEPENDS:${PN} += "python-abi \
python310-paramiko"

inherit rpm
