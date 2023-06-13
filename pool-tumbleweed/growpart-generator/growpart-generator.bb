SUMMARY = "Grow a partition automatically"
DESCRIPTION = "This systemd generator implements the 'x-growpart.grow' mount options in /etc/fstab \
allowing to grow the referenced partition to its maximum size. \
It behaves like 'x-systemd.growfs' and is usually used in combination with that."
LICENSE = "GPL-3.0-only"

PV = "0.8"

RPM_NAME = "growpart-generator-0.8-3.5.noarch.rpm"
RPM_HASH = "f01dee77eafb0b83ed139138b22cca4ffa72f947f627623f2b61ab06bdc93f5f8fce1c769997dcf7274213918bbffa35cede9ab987908d08621d673e870685c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "growpart-generator"

RDEPENDS:${PN} += "/bin/sh \
growpart \
systemd"

inherit rpm
