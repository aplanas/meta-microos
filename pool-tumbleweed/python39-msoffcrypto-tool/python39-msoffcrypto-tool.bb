SUMMARY = "Library for decrypting MS Office files"
DESCRIPTION = "A Python tool and library for decrypting MS Office \
files with passwords or other keys."
LICENSE = "MIT"

PV = "4.10.2"

RPM_NAME = "python39-msoffcrypto-tool-4.10.2-3.16.noarch.rpm"
RPM_HASH = "905b461c312e7e4f8209d8d0ce209a4a7a735d960e1b913dbdca91407d35754c8c33d9af16a1570f456e6cd7bfae056f3c6f69a8cd675e8f143d40adf8bf86f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-msoffcrypto-tool \
python39-msoffcrypto-tool \
python3dist-msoffcrypto-tool"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cryptography \
python39-olefile \
python39-setuptools \
update-alternatives"

inherit rpm
