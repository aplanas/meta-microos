SUMMARY = "Busybox applets replacing bzip2"
DESCRIPTION = "This package contains the symlinks to replace bzip2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bzip2-1.36.1-30.1.noarch.rpm"
RPM_HASH = "a380c45fd6caae17aaedc9e01526a3ba98d6a17d3c231582633879d59bbcf5baa3daa08b2f7e57998423d166cd5a93f8e803c136bffed998e391b7f2674b9eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bzip2"

RDEPENDS:${PN} += "busybox"

inherit rpm
