SUMMARY = "Busybox sh, ash and hush"
DESCRIPTION = "This package contains the busybox sh, ash and hush."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sh-1.36.1-27.1.noarch.rpm"
RPM_HASH = "425ae538e9c13bc5259707d3651efbf2d983fb0143a6d93073393a7daecad695ab758fadb1e499301a277823a1df0767e0c42c4554f3718cf23ba418cfbffe46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
busybox-sh"

RDEPENDS:${PN} += "busybox"

inherit rpm
