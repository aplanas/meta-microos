SUMMARY = "An expect-like extension for the Paramiko SSH library"
DESCRIPTION = "Paramiko Expect provides an expect-like extension for the Paramiko SSH library \
which allows scripts to fully interact with hosts via a true SSH \
connection. \
 \
The class is constructed with an SSH Client object (this will likely be \
extended to support a transport in future for more flexibility)."
LICENSE = "MIT"

PV = "0.3.5"

RPM_NAME = "python39-paramiko-expect-0.3.5-1.3.noarch.rpm"
RPM_HASH = "9be9ef05060a0fa44970f8d502378183a2e613f00b3a86afb0101294fe7a57124d1d313a31338c203df991e8b6935fb1c2e831fb4e8cc8ce6f16f9b1bf95acf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-paramiko-expect \
python39-paramiko-expect \
python3dist-paramiko-expect"

RDEPENDS:${PN} += "python-abi \
python39-paramiko"

inherit rpm
