SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python311-pyspnego-0.9.2-1.1.noarch.rpm"
RPM_HASH = "e4b4d1c659cf584d83d53d69e3321308187ff1b23c79c377989b4e55b4560f3efb5754176af77432342c63621338b1770cbb1c957054a28127720e17d155c790"
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
