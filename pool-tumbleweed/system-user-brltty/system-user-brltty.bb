SUMMARY = "System user and group named brltty"
DESCRIPTION = "System user for the Braille display driver for Linux/Unix"
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "system-user-brltty-6.5-2.4.noarch.rpm"
RPM_HASH = "caff9dfe8bbe0fde75b4ef0524dd12042614beeba1003612faa1e4e2bdc84004875d44c0614a2a8a1b9adc7f9714c81edaeaae6ab52c8450cbd9abe3d11adb62"
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
