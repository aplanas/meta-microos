SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python310-acme-1.31.0-1.3.noarch.rpm"
RPM_HASH = "906c2d209b2ef83367582c96ed87274196346dd0540cf25f103e7f01a7bf22a028ac3dc2daf9a3e9515b1b386c97156e545551baa53003b8d4cc620b8e143101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-acme \
python3.10dist-acme \
python310-acme \
python3dist-acme"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-josepy \
python310-pyOpenSSL \
python310-pyRFC3339 \
python310-pytz \
python310-requests \
python310-requests-toolbelt"

inherit rpm
