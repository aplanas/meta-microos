SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.6.0"

RPM_NAME = "python310-cssutils-2.6.0-1.4.noarch.rpm"
RPM_HASH = "7397dbfa1a33bbdf6a41d804329e78e0ae7d787aae62d5412a019ca4780a4d6073c7f50afceb44f6769a1526d5d6c35cb48295b8f112220adc01a9ecc6f0e43a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cssutils \
python3.10dist-cssutils \
python310-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
