SUMMARY = "Busybox applets replacing attr"
DESCRIPTION = "This package contains the symlinks to replace attr with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-attr-1.36.1-28.1.noarch.rpm"
RPM_HASH = "9c0ea0d3eca09977263c4062d4d9e6a7b45bf62cf23aea5b6ca7e085b75d4990096ee63f9656b9318975d7742c578d04579842dda7abaf58e0bf89722b4b07d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-attr"

RDEPENDS:${PN} += "busybox"

inherit rpm
