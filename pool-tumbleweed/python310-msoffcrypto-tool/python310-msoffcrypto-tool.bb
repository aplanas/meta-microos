SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "4.10.2"

RPM_NAME = "python310-msoffcrypto-tool-4.10.2-3.14.noarch.rpm"
RPM_HASH = "95b426684a57d7593d74433cd287d093cac84cf73361b1a837c05fc4f05ebbeedbab759f8e25371d4c65c677d69851a1cdf98a0746eeb2ac53cc530baa7f077d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msoffcrypto-tool \
python3.10dist-msoffcrypto-tool \
python310-msoffcrypto-tool \
python3dist-msoffcrypto-tool"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-cryptography \
python310-olefile \
python310-setuptools \
update-alternatives"

inherit rpm
