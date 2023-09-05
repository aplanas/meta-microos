SUMMARY = "Busybox applets replacing kbd"
DESCRIPTION = "This package contains the symlinks to replace kbd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kbd-1.36.1-29.1.noarch.rpm"
RPM_HASH = "cfeb18b57715c5867e4af9c2d6f717e8a693d29fac52f40a178f83ea24e939a20b3c67ccbe11df7e36df8726b068d65914e73aac0bb7461c2e3f6929361c51d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-kbd"

RDEPENDS:${PN} += "busybox"

inherit rpm
