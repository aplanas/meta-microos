SUMMARY = "Busybox applets replacing diffutils"
DESCRIPTION = "This package contains the symlinks to replace diffutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-diffutils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "e00bac97b4e6e705b221aedd24fee9f31c1fe3d6098f09a0fb7981b17d97f70043725c419834759a0431c730e49f858318711ec4610ae6154367f708267b8d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-diffutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
