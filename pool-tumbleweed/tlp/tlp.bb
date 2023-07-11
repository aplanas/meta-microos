SUMMARY = "Tools to save battery power on laptops"
DESCRIPTION = "TLP implements advanced power management for Linux. \
TLP is a pure command line tool with automated background tasks. \
It does not contain a GUI."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.5.0"

RPM_NAME = "tlp-1.5.0-1.4.noarch.rpm"
RPM_HASH = "0af13c71eec48a8c99bd5c95567ba1db26da994b9ae29927090a34b6551cc564ec6d8964c3338000d80fba4c5d4e8fa4391007df60ba428d93946b5849637584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tlp \
tlp"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
hdparm \
iw \
pciutils \
rfkill \
systemd \
usbutils \
util-linux"

inherit rpm
