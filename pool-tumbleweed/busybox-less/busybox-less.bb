SUMMARY = "Busybox applets replacing less"
DESCRIPTION = "This package contains the symlinks to replace less with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-less-1.36.0-26.3.noarch.rpm"
RPM_HASH = "256ed198f46ab5aceca599f4c42baeef9e10643de53302f75dfb3621918771ecfb8e02ab11d8234d338cffd22d4283b450559ce890e2a747d630a067208612fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-less"

RDEPENDS:${PN} += "busybox"

inherit rpm
