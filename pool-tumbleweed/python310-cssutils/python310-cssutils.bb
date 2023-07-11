SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python310-cssutils-2.7.1-1.1.noarch.rpm"
RPM_HASH = "ad9cfc01f36a0878400eea5a66fb00e512ae87c472368934cb443e38d3f4dd20217bae9245f9d7d6f2f3b1cbf5fab13e53738fa64ec55852199f8af3ee633413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cssutils \
python310-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
