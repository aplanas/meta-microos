SUMMARY = "Busybox applets not fitting anywhere else"
DESCRIPTION = "This package contains the symlinks to provide various busybox applets which \
do not fit really to any other package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-misc-1.36.1-30.1.noarch.rpm"
RPM_HASH = "b2c3ee9b6c138e72f62ecf786f02c844da46df2c836bd5b605bbf585d4cbed46cf84bd38642ab6b9496df567b78f0986870058652a4dce8485d0fbc3d0a42472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-misc"

RDEPENDS:${PN} += "busybox"

inherit rpm
