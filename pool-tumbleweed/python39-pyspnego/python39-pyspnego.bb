SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-pyspnego-0.9.0-1.3.noarch.rpm"
RPM_HASH = "a1e6487378bc1145002a29b88741d90959628f588c5ba9c63515d2fac39f2a00f4e258534d6a2ed8725dfb92a86ed6f1a1c6ee8050ac0bc205abc869ba2abcc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyspnego \
python39-pyspnego \
python3dist-pyspnego"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cryptography \
update-alternatives"

inherit rpm
