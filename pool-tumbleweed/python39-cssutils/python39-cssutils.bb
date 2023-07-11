SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python39-cssutils-2.7.1-1.1.noarch.rpm"
RPM_HASH = "137f2ea73417feb46a08371601469ec09f9ac6a3a427df7b15e7a29c79fd8b43e68c7762704da484aa6d07f8f9fa150aa297b0312cb1d36718779db83416f340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssutils \
python39-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
