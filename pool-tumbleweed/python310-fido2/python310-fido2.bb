SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python310-fido2-1.1.1-2.1.noarch.rpm"
RPM_HASH = "d9b3fd2d9fe5d4329659a729750ef76e06f95570f19b857ba6c225c6e0410295df10d2c8d84c7ccd67e0b6d4653efac4dcce3eb1926a50250114a5a48aaf0f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fido2 \
python310-fido2 \
python3dist-fido2"

RDEPENDS:${PN} += "python-abi \
python310-cryptography"

inherit rpm
