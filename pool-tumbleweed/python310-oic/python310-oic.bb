SUMMARY = "A complete OpenID Connect implementation in Python"
DESCRIPTION = "This is a complete Python implementation of OpenID Connect as specified in \
the OpenID Connect Core specification. As a side effect, this is a complete \
implementation of OAuth2.0 too."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "python310-oic-1.5.0-1.5.noarch.rpm"
RPM_HASH = "14628facbb3ce86cc669c52e253b3fc0d7f2628720e739514d78868ced71cec6488d7e963006edf7278e018117e56d7511eeaa19db14f718ddd42af56debafde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oic \
python3.10dist(oic) \
python310-oic \
python3dist(oic)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Beaker \
python310-Mako \
python310-cryptography \
python310-dbm \
python310-defusedxml \
python310-pycryptodomex \
python310-pyjwkest \
python310-requests \
python310-typing \
python310-typing_extensions"

inherit rpm
