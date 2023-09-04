SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python310-cssutils-2.7.1-2.1.noarch.rpm"
RPM_HASH = "0e88f2076a6395c88ca0d6b3850965feea55250581b1f119f18ec6b1a23805d1793c5ed320bb6b9aea2682eca6563d87aee0636a79e1efd4f04abb9502c527f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cssutils \
python310-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
