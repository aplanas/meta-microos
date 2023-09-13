SUMMARY = "Busybox applets replacing patch"
DESCRIPTION = "This package contains the symlinks to replace patch with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-patch-1.36.1-30.1.noarch.rpm"
RPM_HASH = "963f1e08fa2b4a8e04f2beac2cbbd14f5c72c6aac88e538e0e61b42389b0e0ac61552993f32983eaaa90ebb2affe772702d70515470656c968758a016c571d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-patch"

RDEPENDS:${PN} += "busybox"

inherit rpm
