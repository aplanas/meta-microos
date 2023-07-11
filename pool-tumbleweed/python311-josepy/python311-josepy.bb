SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python311-josepy-1.13.0-2.3.noarch.rpm"
RPM_HASH = "5489b57ce17aa25e91cbf6926a304ac3ce6b5222e6b3c76573200fe6cb848de2104c90dbdb49896db09413944785df2e514cd2b5f96d2f1b57c5f3b4d28755d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-josepy \
python3.11dist-josepy \
python311-josepy \
python3dist-josepy"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-pyOpenSSL"

inherit rpm
