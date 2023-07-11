SUMMARY = "Create and sign CAs and certificates"
DESCRIPTION = "Create and sign CAs and certificates."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "python39-certipy-0.1.3-2.13.noarch.rpm"
RPM_HASH = "16fa52dbbd6a640cd9f4af17e8a9a3088ff54b33931d1d43d0a9218bb74f69c2841c1d81ea3b7d00cb6ffb8f905838d3abc561b319d8fd9ce918a4ee4961c920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-certipy \
python39-certipy \
python3dist-certipy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pyOpenSSL \
update-alternatives"

inherit rpm
