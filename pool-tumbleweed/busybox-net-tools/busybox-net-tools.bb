SUMMARY = "Busybox applets replacing net-tools"
DESCRIPTION = "This package contains the symlinks to replace net-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-net-tools-1.36.1-28.1.noarch.rpm"
RPM_HASH = "547ba4d66461fa21cc6e0750bde30e5cee2f52bc13d62706c1ab5d2712f44d8e174815209f5d8b348dfb4e7b9074a66df3021ad4918321359a6952d669f10e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-net-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
