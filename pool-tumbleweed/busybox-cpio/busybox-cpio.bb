SUMMARY = "Busybox applets replacing cpio"
DESCRIPTION = "This package contains the symlinks to replace cpio with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-cpio-1.36.1-30.1.noarch.rpm"
RPM_HASH = "1fa7b8330b31ba5b5f978da960d582d31a642b5b726bf7a82db7f17c9222cecad47517ecc16f8d7a364989e8bd9490fc5cd638b58fe6f61e801efe919c9d487a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-cpio"

RDEPENDS:${PN} += "busybox"

inherit rpm
