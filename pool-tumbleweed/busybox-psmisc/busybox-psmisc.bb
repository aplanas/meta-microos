SUMMARY = "Busybox applets replacing psmisc"
DESCRIPTION = "This package contains the symlinks to replace psmisc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-psmisc-1.36.1-27.1.noarch.rpm"
RPM_HASH = "1dead68dcadbc961bb7862832fe5db438f7be4db2466866dd16358a6b3b924b1efc32780ec976eb01e7e3764600ee4e7cca26c3a64f9751f20c8ec64af132590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/fuser \
busybox-psmisc"

RDEPENDS:${PN} += "busybox"

inherit rpm
