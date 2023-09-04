SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python311-cssutils-2.7.1-2.1.noarch.rpm"
RPM_HASH = "e7d5e0a10a018171cfc181a92908c5cb97ea7aafe201c1b39454cfd473bcd7db6716ffc7d299c38e67fdd84b566072748af3179f214392eedabcd82b03fcf3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssutils \
python3.11dist-cssutils \
python311-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
