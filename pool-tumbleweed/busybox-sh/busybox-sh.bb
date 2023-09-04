SUMMARY = "Busybox sh, ash and hush"
DESCRIPTION = "This package contains the busybox sh, ash and hush."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sh-1.36.1-28.1.noarch.rpm"
RPM_HASH = "3a8517887d01f97e2d62dc0112d3be1710dfac8b08d798b21365b2815516eebbcd36a777fd671db557adc203a86559d06a2f424b6ff4cb4278dd901fc5f97aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
busybox-sh"

RDEPENDS:${PN} += "busybox"

inherit rpm
