SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "4.10.2"

RPM_NAME = "python311-msoffcrypto-tool-4.10.2-3.16.noarch.rpm"
RPM_HASH = "114ddc04b25585d3ea53e9beb75c884adea855f0580bd71e41f0cec0160e06ce90d119b77bdae8aacad5f14774c1698f4d35987a998c5d003cb053b6b74adc38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msoffcrypto-tool \
python3.11dist-msoffcrypto-tool \
python311-msoffcrypto-tool \
python3dist-msoffcrypto-tool"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
python311-olefile \
python311-setuptools \
update-alternatives"

inherit rpm
