SUMMARY = "Plymouth related utilities for dracut"
DESCRIPTION = "This package contains utilities that integrate dracut with Plymouth"
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-dracut-22.02.122+94.4bd41a3-10.1.noarch.rpm"
RPM_HASH = "c77d164f5599b333182b68b1a3f68b6365479e7e7ad0fa59888372e4b9990853f3128231744984e7117988b804d9ce7293377709fcd4f2839aae63b55fd6db21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-dracut"

RDEPENDS:${PN} += "/usr/bin/bash \
plymouth"

inherit rpm
