SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python39-fido2-1.1.1-1.1.noarch.rpm"
RPM_HASH = "43b79b5b3a8ca49215775fac1d69a12bf7e5c6efb76e101adac040b167765f8159bde08bfce45e872b0316468aeac2b9dce9267aef2344ccd7094a0fe19c446e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fido2 \
python39-fido2 \
python3dist-fido2"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
