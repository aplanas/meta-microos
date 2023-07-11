SUMMARY = "RPM List Builder"
DESCRIPTION = "RPM List Builder."
LICENSE = "GPL-2.0+"

PV = "1.1.1"

RPM_NAME = "python310-rpmlb-1.1.1-1.14.noarch.rpm"
RPM_HASH = "71bcdc3809d557830d1ccd3129fe948d2ba6e1a89e19a0d2c95b0eed0591e9690f97824f9135c17809a97b819fae4f45af1ebbc9ff589b39937da20d572dffb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rpmlb \
python310-rpmlb \
python3dist-rpmlb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-click \
python310-retry"

inherit rpm
