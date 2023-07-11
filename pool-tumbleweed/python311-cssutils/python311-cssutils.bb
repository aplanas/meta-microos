SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python311-cssutils-2.7.1-1.1.noarch.rpm"
RPM_HASH = "8d48ecae9c314671f281925d2d9a451276f37c144f51b42f6063f4273a25860807c878daf0f694ac8ef4caa30a403b8e1f8a388c5fdff31e51af74318a1ffcae"
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
