SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python310-acme-2.6.0-1.3.noarch.rpm"
RPM_HASH = "bfa853d3dd60113ac06123dd072d0d10e761163b745048c01ce1a048285d413051b9cdf6ef6053d764dda073fb07e819b49454b1de3fa6694e1f6d948e89583b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-acme \
python310-acme \
python3dist-acme"

RDEPENDS:${PN} += "python-abi \
python310-cryptography \
python310-josepy \
python310-pyOpenSSL \
python310-pyRFC3339 \
python310-pytz \
python310-requests"

inherit rpm
