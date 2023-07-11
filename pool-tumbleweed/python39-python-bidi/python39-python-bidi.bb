SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "python39-python-bidi-0.4.2-3.12.noarch.rpm"
RPM_HASH = "0de4bd1603663c541a59228b48bb724f2f863e3377cf046e1a34ff0b443b66becd4954b515c37a2f9320b9055635a4bb700d56e49e565e53e5aafb46b066173f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-bidi \
python39-python-bidi \
python3dist-python-bidi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
