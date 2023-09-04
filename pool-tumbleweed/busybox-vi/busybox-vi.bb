SUMMARY = "Busybox applets replacing vim"
DESCRIPTION = "This package contains the symlinks to provide vi with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vi-1.36.1-28.1.noarch.rpm"
RPM_HASH = "cba3461d0d8bf79694b7051bd9309963148427da5dbd6747db9c01a5db85f41737dcb6d89fb06941ce9627c7234f5aecc0f970ae94e8fca64976c7fe32f6362a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vi"

RDEPENDS:${PN} += "busybox"

inherit rpm
