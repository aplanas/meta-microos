SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python311-pyspnego-0.9.0-1.3.noarch.rpm"
RPM_HASH = "23cdf7dbb74b6b2e86bd244b3dec3d12d6b3e7105fbd8646d466d250a86d8a75036d03bc348747d84b9cb5315cc6b3ff7ecc645ede9af3dccfcf6c601a557c69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyspnego \
python3.11dist-pyspnego \
python311-pyspnego \
python3dist-pyspnego"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
update-alternatives"

inherit rpm
