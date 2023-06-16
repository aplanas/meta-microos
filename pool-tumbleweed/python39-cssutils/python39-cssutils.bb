SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "python39-cssutils-2.6.0-1.4.noarch.rpm"
RPM_HASH = "73764c2b4fbf8378a45bc2d8b18a5f1c27c3d04a0728f179eee8ea074feeba5f7cb4aac3f74bdada441af8c897c698d9342cdabd00deed5bfe056fed133f20f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssutils \
python39-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
