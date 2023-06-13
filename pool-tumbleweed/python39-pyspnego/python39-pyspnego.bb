SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-pyspnego-0.9.0-1.1.noarch.rpm"
RPM_HASH = "fc6f30bebe058dcf0bebc6f029c17c4c86785eae7fb0aca0a4ef0b42433a9ba6ba60c58303b1a85015f4244660243b10864ac5870f8ce88d6b4bd78342b11ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyspnego) \
python39-pyspnego \
python3dist(pyspnego)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-cryptography \
update-alternatives"

inherit rpm
