SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python39-josepy-1.13.0-2.3.noarch.rpm"
RPM_HASH = "4ce8fc018b138f44ee1750f7f7cdf3468f48cb089fea2aea618dab5d84d7717ce501c26bcfde5e2d46a879fcc1ca2a79ba26cb3b1c3c4ee48dc1e68548a4868e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-josepy \
python39-josepy \
python3dist-josepy"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-pyOpenSSL"

inherit rpm
