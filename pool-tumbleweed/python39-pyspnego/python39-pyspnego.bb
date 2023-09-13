SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python39-pyspnego-0.9.2-1.1.noarch.rpm"
RPM_HASH = "65c65e1bdb12e5fa74a563777098f3aedbe1559006373446ed2ca44b61a5890180fea274d4840b672b6b6bc035194f44aa5eada8847889c55831ab8e1e70e674"
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
