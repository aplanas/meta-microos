SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python311-acme-2.6.0-1.3.noarch.rpm"
RPM_HASH = "49da3ee0a10035aaf2e3d71d5f9d3811885dd9647b25e9fdd55ec9e46321d817cdf423ea028bae539529d6a85913ae4b87570503a6fad5efef85e14d0d988676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-acme \
python3.11dist-acme \
python311-acme \
python3dist-acme"

RDEPENDS:${PN} += "python-abi \
python311-cryptography \
python311-josepy \
python311-pyOpenSSL \
python311-pyRFC3339 \
python311-pytz \
python311-requests"

inherit rpm
