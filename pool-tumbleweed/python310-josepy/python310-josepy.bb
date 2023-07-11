SUMMARY = "JOSE protocol implementation in Python"
DESCRIPTION = "JOSE protocol implementation in Python using cryptography. \
It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.13.0"

RPM_NAME = "python310-josepy-1.13.0-2.3.noarch.rpm"
RPM_HASH = "bce98d39928f276e241424ac4dce8abb00e3501697ba584d0003c53d55459cacb46988ecc2a651e391ea342b742492d0eb6ac89bd74786601b24f21f1a3aa35a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-josepy \
python310-josepy \
python3dist-josepy"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-pyOpenSSL"

inherit rpm
