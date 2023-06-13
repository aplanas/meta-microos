SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python311-oic-1.5.0-1.5.noarch.rpm"
RPM_HASH = "4288b9e9ab517f719475b3cf0a3270dc15ee5be5e93cc851087f96151ee72d8faa405c15ebd1fa783845563cbbe56dc5a8f4fd42941944e9b1b7f7e6a337e1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(oic) \
python311-oic \
python3dist(oic)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Beaker \
python311-Mako \
python311-cryptography \
python311-dbm \
python311-defusedxml \
python311-pycryptodomex \
python311-pyjwkest \
python311-requests \
python311-typing \
python311-typing_extensions"

inherit rpm
