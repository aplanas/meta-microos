SUMMARY = "A GSSAPI authentication handler for python-requests"
DESCRIPTION = "A GSSAPI authentication handler for python-requests"
LICENSE = "ISC"

PV = "1.2.3"

RPM_NAME = "python39-requests-gssapi-1.2.3-1.8.noarch.rpm"
RPM_HASH = "6c0ae09364fabf402fa94416f504f051707abace9d629b91cb748345b120b2ae8a613e23285463bc1790ad976a0d46b2e105b24dd944d257d3425148a9bdf67e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-gssapi \
python39-requests-gssapi \
python3dist-requests-gssapi"

RDEPENDS:${PN} += "python-abi \
python39-gssapi \
python39-requests"

inherit rpm
