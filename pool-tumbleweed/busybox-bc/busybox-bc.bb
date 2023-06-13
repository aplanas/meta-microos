SUMMARY = "Busybox applets replacing bc"
DESCRIPTION = "This package contains the symlinks to provide bc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-bc-1.36.0-26.3.noarch.rpm"
RPM_HASH = "be4530ad3faafdd28498cce1c46fe3eb6d62c1435ea467ce3cb2917e819d2d9c0cdc8ac37f9f0fcf90907b7f275fe4b756be938b464513d8b96ed95d2683c0be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bc"

RDEPENDS:${PN} += "busybox"

inherit rpm
