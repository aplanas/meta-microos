SUMMARY = "A small python module for wake on lan"
DESCRIPTION = "A small python module for wake on lan."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-wakeonlan-3.0.0-1.1.noarch.rpm"
RPM_HASH = "2334708f83bf1b347ec82aee77e2e92707cceb48ad9a747bc94f6c1438549e9e0c4aaac38beb381d9c84f7dc2371976ddb160f9cfa684a9af43a6258316be802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wakeonlan \
python3.10dist-wakeonlan \
python310-wakeonlan \
python3dist-wakeonlan"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
