SUMMARY = "A CSS Cascading Style Sheets library for Python"
DESCRIPTION = "A Python package to parse and build CSS Cascading Style Sheets. DOM only, not any rendering facilities!"
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "python39-cssutils-2.7.1-2.1.noarch.rpm"
RPM_HASH = "2401fdf8be91a686814b5213eaa8178f5a79a004ccd7952897f5e8252d502bec128bf87cc307fa0c5c6726190b12c39ef141790105c7369a55c4c3e799b8e8cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cssutils \
python39-cssutils \
python3dist-cssutils"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
