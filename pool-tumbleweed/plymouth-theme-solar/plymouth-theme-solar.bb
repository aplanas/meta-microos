SUMMARY = "Plymouth 'Solar' theme"
DESCRIPTION = "This package contains the 'Solar' boot splash theme for \
Plymouth. It features a blue flamed sun with animated solar flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-solar-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "abe903564e48c85ff90a7cf62d8fe345f98c1b6f1a0dd7d07e9a1c8bc19ea847394c8d7fd57fd9a0bdaa7f2f4ea8f26c213deb39e1ef1ce3d6df4ccf94d5fbb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-solar"
RDEPENDS:${PN} += "/bin/sh \
plymouth-plugin-space-flares \
plymouth-scripts"

inherit rpm
