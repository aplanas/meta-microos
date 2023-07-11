SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python310-pyspnego-0.9.0-1.3.noarch.rpm"
RPM_HASH = "c2af95db53a746d8379e1fcc34dd190c0b9010b584e8f46eb18bf2292259bfa189bccbba31774366e0122fdc852d5980c3aff77dc2222422b8caafc580c9a60b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyspnego \
python310-pyspnego \
python3dist-pyspnego"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cryptography \
update-alternatives"

inherit rpm
