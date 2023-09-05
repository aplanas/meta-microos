SUMMARY = "Busybox applets replacing hexedit"
DESCRIPTION = "This package contains the symlinks to replace hexedit with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hexedit-1.36.1-29.1.noarch.rpm"
RPM_HASH = "822cd860d6bdae31c83498b5ad298636a8a99986fd87561a40525427b01427552e7a72496bd6348ead8075569f1fd35916dcbc577b739acb6095c64b0ea6868e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-hexedit"

RDEPENDS:${PN} += "busybox"

inherit rpm
