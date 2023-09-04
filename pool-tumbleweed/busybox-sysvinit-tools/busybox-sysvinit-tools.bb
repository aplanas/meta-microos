SUMMARY = "Busybox applets replacing sysvinit-tools"
DESCRIPTION = "This package contains the symlinks to provide sysvinit-tools with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sysvinit-tools-1.36.1-28.1.noarch.rpm"
RPM_HASH = "ee6776e618b590376f0dd606e468bd4aeaf38abfed3d75f55fe38e5638d1518c1c30d14203db66c6922efe19320757444df839e1d85f64b4479aad120ea1fbf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sysvinit-tools"

RDEPENDS:${PN} += "busybox"

inherit rpm
