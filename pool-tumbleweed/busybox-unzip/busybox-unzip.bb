SUMMARY = "Busybox applets replacing unzip"
DESCRIPTION = "This package contains the symlinks to replace unzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-unzip-1.36.1-29.1.noarch.rpm"
RPM_HASH = "b4ede03bfd34e06091d5d9a2258361a8c9e62788326b0f666d0467248fcb3e68d723c9f97cad959ec636bd38a4e75be6052426a229370f277d2c0bb95c9d5077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-unzip"

RDEPENDS:${PN} += "busybox"

inherit rpm
