SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python311-paramiko-expect-0.3.5-1.3.noarch.rpm"
RPM_HASH = "20b43b623c31dc092afe529b31aca333df540339a31cf178f3e32c80e0311293b707f077d789b3c2e9c2feb26d81aa5a67f5d278e059af41d802e27686ca21ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-paramiko-expect \
python3.11dist-paramiko-expect \
python311-paramiko-expect \
python3dist-paramiko-expect"

RDEPENDS:${PN} += "python-abi \
python311-paramiko"

inherit rpm
