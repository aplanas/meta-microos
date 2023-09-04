SUMMARY = "System user and group named brltty"
DESCRIPTION = "System user for the Braille display driver for Linux/Unix"
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "system-user-brltty-6.6-1.1.noarch.rpm"
RPM_HASH = "58f9ab0a2163bb7f3841be3d70c5bb2e18b5a22417ece27698898e5c918628bcf3cba3e8024e9e2d380db3a3f3a05d9b3b000df8678a4351dc4fa981e6e11771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-brlapi \
group-brltty \
system-user-brltty \
user-brltty"

RDEPENDS:${PN} += "/usr/bin/sh \
group-audio \
group-dialout \
group-input \
group-pulse-access \
group-root \
group-tty \
sysuser-shadow"

inherit rpm
