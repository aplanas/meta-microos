SUMMARY = "Python SPNEGO authentication library"
DESCRIPTION = "Library to handle SPNEGO (Negotiate, NTLM, Kerberos) authentication. \
Also includes a packet parser that can be used to decode raw \
NTLM/SPNEGO/Kerberos tokens into a human readable format."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python310-pyspnego-0.9.2-1.1.noarch.rpm"
RPM_HASH = "6c2918e2ff440097a8e98cb4b0e41bd330c72e999d803eff0057f8856d9eb4ff3405b179342acdb583afaba62209a275e9c7315df72b8eb547eda41949d57506"
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
