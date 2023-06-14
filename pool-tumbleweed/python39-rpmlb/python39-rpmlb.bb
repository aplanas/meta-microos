SUMMARY = "RPM List Builder"
DESCRIPTION = "RPM List Builder."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "python39-rpmlb-1.1.1-1.12.noarch.rpm"
RPM_HASH = "ba36cdb7c53d39d18b426248670bee5d89b9ad0f30088636d2a14d5b3b3216c847d75d37448643b6ec71a20570a440d4859f02fa89b33a32563d9b36f5fd8783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rpmlb \
python39-rpmlb \
python3dist-rpmlb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyYAML \
python39-click \
python39-retry"

inherit rpm
