SUMMARY = "Sphinx objectsinv Inspection/Manipulation Tool"
DESCRIPTION = "Sphinx objects.inv Inspection/Manipulation Tool"
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python310-sphobjinv-2.2.2-1.6.noarch.rpm"
RPM_HASH = "00c7a150f66c432834383df6b891c4e900fb38285605cedc7edb7359e77b7ce1fde0ea103123ede39f5599f643a6bd874abec8b8e98bdfc6f21aeca0db415f12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphobjinv \
python310-sphobjinv \
python3dist-sphobjinv"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-certifi \
python310-jsonschema \
update-alternatives"

inherit rpm
