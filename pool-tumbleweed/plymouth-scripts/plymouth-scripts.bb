SUMMARY = "Plymouth related scripts"
DESCRIPTION = "This package contains scripts that help integrate Plymouth with \
the system."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-scripts-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "8d1d7c99c49d260c46c264a5173cd8c724086e790bc7edc16e8ec6a21607d11d808dda09f0018889c4b2bd992d2e4529ff12c97e54b6810ed2ed1a09f1efd2c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
dracut \
grep \
plymouth \
sed"

inherit rpm
