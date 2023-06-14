SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-pyspnego-0.9.0-1.1.noarch.rpm"
RPM_HASH = "2e69a269bdb4d44fca1a6f3260f540d38cb88fe98204576a4c77b6cee27a1c19d6ab4f3bd759ddfa097b84c49aff3e7e5d17e78ec7389d2d270f88b794a11c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyspnego \
python311-pyspnego \
python3dist-pyspnego"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-cryptography \
update-alternatives"

inherit rpm
