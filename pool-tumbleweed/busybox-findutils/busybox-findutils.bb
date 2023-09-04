SUMMARY = "Busybox applets replacing findutils"
DESCRIPTION = "This package contains the symlinks to replace findutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-findutils-1.36.1-28.1.noarch.rpm"
RPM_HASH = "448661ad50c143ee96a18bd36cefa59c5ba8c0f9d0b2c485dbcfe0fdfb0b902065312fdf240379953adce8871f0e3ac7f154a78160a972c3506e836256975f19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-findutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
