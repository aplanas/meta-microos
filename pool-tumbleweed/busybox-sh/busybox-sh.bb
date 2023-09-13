SUMMARY = "Busybox sh, ash and hush"
DESCRIPTION = "This package contains the busybox sh, ash and hush."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sh-1.36.1-30.1.noarch.rpm"
RPM_HASH = "634c6e225e241da05f6a4daeb6420392906dbef6bf537a3991a1cd14cb3ea96e4290bb6ffa0a2325b80c81bcb997858193b5420a7db52077e1033e19ca7c47c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
busybox-sh"

RDEPENDS:${PN} += "busybox"

inherit rpm
