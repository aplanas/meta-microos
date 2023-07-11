SUMMARY = "System user and group named brltty"
DESCRIPTION = "System user for the Braille display driver for Linux/Unix"
LICENSE = "LGPL-2.1-or-later"

PV = "6.5"

RPM_NAME = "system-user-brltty-6.5-3.1.noarch.rpm"
RPM_HASH = "94e6c675f838c3b8b34ffdb3805a9f5f1a3a3d647db0e52468e30f22a00e53de890419ba71e6be36b12a17a87da5df6bbed9dfb669141541b5a944f9a33b7d39"
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
