SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python311-josepy-1.13.0-1.6.noarch.rpm"
RPM_HASH = "4e1ae652b6bb1e384254804c5d10b887368ee01300b8475c4feb7435e2bdad132f8b3fc34dccbad48a941cf74dbc4731ac84364dbdddcb2189943d841e732ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(josepy) \
python311-josepy \
python3dist(josepy)"

RDEPENDS:${PN} += "python(abi) \
python311-cryptography \
python311-pyOpenSSL"

inherit rpm
