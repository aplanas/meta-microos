SUMMARY = "Busybox applets replacing bind-utils"
DESCRIPTION = "This package contains the symlinks to replace bind-utils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-bind-utils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "af6eff56bec0c2507b1bcff5b04c091b14f77f92848ca39435932985aa4e343933b779153e9779d5f8ef7b998c342ae635e87bf7f6ec5b611b29e3fb309023ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-bind-utils"

RDEPENDS:${PN} += "busybox"

inherit rpm
