SUMMARY = "BiDi layout algorithm"
DESCRIPTION = "A pure python implementation of the BiDi layout algorithm."
LICENSE = "LGPL-3.0-only"

PV = "0.4.2"

RPM_NAME = "python311-python-bidi-0.4.2-3.12.noarch.rpm"
RPM_HASH = "a06dd4fdf0d3124da74eda7d35c0dbb36d43cdae3f1e665069dd3379ae8a2383fbe4e1c9d5cfecdaa86ee8c8d5f89e3e539dbfdbc30e73f5021e7efd7dada6e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-bidi \
python3.11dist-python-bidi \
python311-python-bidi \
python3dist-python-bidi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
