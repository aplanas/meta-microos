SUMMARY = "Busybox applets replacing attr"
DESCRIPTION = "This package contains the symlinks to replace attr with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-attr-1.36.1-30.1.noarch.rpm"
RPM_HASH = "c708b9e0ca2917d52356d5e0c6fc5ba86aa1b54d8c4903a6ba9604b0e1533a9cce9878b41763d30355fdbd26fed5506009a581da494cbcc28b4c5e1035fac1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-attr"

RDEPENDS:${PN} += "busybox"

inherit rpm
