SUMMARY = "Busybox applets replacing which"
DESCRIPTION = "This package contains the symlinks to replace which with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-which-1.36.1-28.1.noarch.rpm"
RPM_HASH = "7a0899f1e07f4a28ed4859a32e7165ea73aa9befca55083fb3d2d398076340f01dbc38f4b4b90326d2b2d5fa5c25c4a928677d4fb39b20c3822be255a4728ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-which"

RDEPENDS:${PN} += "busybox"

inherit rpm
