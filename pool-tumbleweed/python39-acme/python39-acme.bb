SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "python39-acme-2.6.0-1.3.noarch.rpm"
RPM_HASH = "a66cb0fad65c6cf61a63339ee61122d6c6b4e60918a8a6f6b4a338d98e54f34cf8aeb09e3e37af80359652ca2b7a6eb11aee5bf20f466c027e7a1daf3939e88c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-acme \
python39-acme \
python3dist-acme"

RDEPENDS:${PN} += "python-abi \
python39-cryptography \
python39-josepy \
python39-pyOpenSSL \
python39-pyRFC3339 \
python39-pytz \
python39-requests"

inherit rpm
