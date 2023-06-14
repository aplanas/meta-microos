SUMMARY = "RPM List Builder"
DESCRIPTION = "RPM List Builder."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "python310-rpmlb-1.1.1-1.12.noarch.rpm"
RPM_HASH = "fa047e94799cfecea4bd3b36072d25f4d2df63be3f3d7b5387d693aa0ce3ba4075ea8fbf7699d966bb252a3c5e7360d1f80c41f53de0124bd02300f864c27dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rpmlb \
python3.10dist-rpmlb \
python310-rpmlb \
python3dist-rpmlb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-PyYAML \
python310-click \
python310-retry"

inherit rpm
