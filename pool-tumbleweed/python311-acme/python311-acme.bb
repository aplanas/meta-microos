SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python311-acme-1.31.0-1.3.noarch.rpm"
RPM_HASH = "1a28864b53a2be6c2b017167b1efefcbc8fbabe99f01dafca3cd88efe99be960dc5184bd30a61bd73bf3bc1a6efa4c38c7a4806b07fb8b637bcf6548f4501d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(acme) \
python311-acme \
python3dist(acme)"

RDEPENDS:${PN} += "python(abi) \
python311-cryptography \
python311-josepy \
python311-pyOpenSSL \
python311-pyRFC3339 \
python311-pytz \
python311-requests \
python311-requests-toolbelt"

inherit rpm
