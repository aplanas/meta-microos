SUMMARY = "Busybox applets replacing sysvinit-tools"
DESCRIPTION = "This package contains the symlinks to provide sysvinit-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sysvinit-tools-1.36.1-29.1.noarch.rpm"
RPM_HASH = "1bf9e59b6d4ba3c0bb2c85133c3a3e22f60ea53b77764284e8210297cd6e47f82c195cdf595616429d7ca37695e550edaa726980e98cc74a43036252149872ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sysvinit-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
