SUMMARY = "Busybox applets replacing tunctl"
DESCRIPTION = "This package contains the symlinks to provide tunctl with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tunctl-1.36.1-27.1.noarch.rpm"
RPM_HASH = "7d1a04fcced4a6eff01b7e4f9d6df63590195a6c5ed62fd6c16879cdc3faf8b6dbde028fa8fab13b0b8940977bab786eb6f9b8ed9b19ab35670af33f2e52fb4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-tunctl"

RDEPENDS:${PN} += "busybox"

inherit rpm
