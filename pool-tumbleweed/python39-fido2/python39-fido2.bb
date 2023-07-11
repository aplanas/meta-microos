SUMMARY = "Python-based FIDO 2.0 library"
DESCRIPTION = "This library supports the FIDO U2F and FIDO 2.0 protocols for communicating \
with a USB authenticator via the Client-to-Authenticator Protocol (CTAP 1 and 2). \
In addition to this low-level device access, classes defined in the fido2.client \
implement higher level device operations."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause & MPL-2.0"

PV = "1.1.1"

RPM_NAME = "python39-fido2-1.1.1-2.1.noarch.rpm"
RPM_HASH = "a9a2030ff0aaca319df95589bf6fa0be4d890b66fc2c1f47d1ae4c7acac98200494a4885e3cf01d10e1de3cd6875c12f76120be680c7b422cd2cd8da63e7535e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fido2 \
python39-fido2 \
python3dist-fido2"

RDEPENDS:${PN} += "python-abi \
python39-cryptography"

inherit rpm
