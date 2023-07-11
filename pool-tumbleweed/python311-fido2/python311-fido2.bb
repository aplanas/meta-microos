SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python311-fido2-1.1.1-2.1.noarch.rpm"
RPM_HASH = "bd9bdc959b3198666f22ec275c7191a95cf366e624ca8d63b5d3fc82d0dab508fb3c2bab301b0e089e7ff5fe39e0b60855b950b52c8d25bcb312c3193c716f13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fido2 \
python3.11dist-fido2 \
python311-fido2 \
python3dist-fido2"

RDEPENDS:${PN} += "python-abi \
python311-cryptography"

inherit rpm
