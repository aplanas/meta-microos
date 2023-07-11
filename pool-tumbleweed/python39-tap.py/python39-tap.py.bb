SUMMARY = "Test Anything Protocol (TAP) tools"
DESCRIPTION = "Test Anything Protocol (TAP) tools."
LICENSE = "BSD-2-Clause"

PV = "3.1"

RPM_NAME = "python39-tap.py-3.1-1.8.noarch.rpm"
RPM_HASH = "27afc6b66d4e9043de7660bb29c08b256c88afd9578aa07014c941c66a7ab908d50c007372091ba85ec0e12051609767c5cd7466719b06630795228c96b5e4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tap.py \
python39-tap.py \
python3dist-tap.py"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
