SUMMARY = "Python library for the ACME protocol"
DESCRIPTION = "Python library implementing the Automatic Certificate Management Environment \
(ACME) protocol. It is used by the certbot project. Formerly Let's Encrypt project."
LICENSE = "Apache-2.0"

PV = "1.31.0"

RPM_NAME = "python39-acme-1.31.0-1.3.noarch.rpm"
RPM_HASH = "e9f1c09cf7d796be85f223c593039b634d473124739d02361765a39e91154b0c2d7329b6b4399f4fcaf2ad47bc593c323a5d111916c93dce3f068259e915115c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(acme) \
python39-acme \
python3dist(acme)"

RDEPENDS:${PN} += "python(abi) \
python39-cryptography \
python39-josepy \
python39-pyOpenSSL \
python39-pyRFC3339 \
python39-pytz \
python39-requests \
python39-requests-toolbelt"

inherit rpm
