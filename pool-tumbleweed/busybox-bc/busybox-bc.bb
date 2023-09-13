SUMMARY = "Busybox applets replacing bc"
DESCRIPTION = "This package contains the symlinks to provide bc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-bc-1.36.1-30.1.noarch.rpm"
RPM_HASH = "c4cfd12532408e3bd97c145db4e735d6b34070aa105ffffe5651affba06e8d75b57b8ffd16bee2c3c8aa88b5beee780cc2585bb903cffdf3d016748d1dd990d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bc"

RDEPENDS:${PN} += "busybox"

inherit rpm
