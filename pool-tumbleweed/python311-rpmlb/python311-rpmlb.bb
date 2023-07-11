SUMMARY = "RPM List Builder"
DESCRIPTION = "RPM List Builder."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "python311-rpmlb-1.1.1-1.14.noarch.rpm"
RPM_HASH = "ee6a7ca98729e8d65b013861015870b1e7ef2736e0a5987e2523d169164dd3968ed2d9b0b8a25920563b6ace187f88739bed7406bef37453e70032bdd5c43ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmlb \
python3.11dist-rpmlb \
python311-rpmlb \
python3dist-rpmlb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-click \
python311-retry"

inherit rpm
