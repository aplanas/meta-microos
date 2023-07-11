SUMMARY = "Python client for copr service"
DESCRIPTION = "Python client for copr service."
LICENSE = "GPL-2.0-or-later"

PV = "1.129"

RPM_NAME = "python311-copr-1.129-1.1.noarch.rpm"
RPM_HASH = "6b490eb84abef3aae26321fa7884943621a574c20b9e5561d9972b4dee3bd3c2211dd66256019dcf67382de7c964a2aa1172882ef43557d3cb0bfd13134f0e74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-copr \
python3.11dist-copr \
python311-copr \
python3dist-copr"

RDEPENDS:${PN} += "python-abi \
python311-filelock \
python311-future \
python311-munch \
python311-requests \
python311-requests-toolbelt"

inherit rpm
