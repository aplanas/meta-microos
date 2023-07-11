SUMMARY = "Busybox applets replacing sed"
DESCRIPTION = "This package contains the symlinks to replace sed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sed-1.36.1-27.1.noarch.rpm"
RPM_HASH = "835c8fbf73b9dfeb3ca4f7e0f3d1767e6a21a3946fe59ca2bad506ff671458371e3dbc51eeac710b5f728dbc30e0f44d549d41a0f766087e7df280a0bfaa12ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sed \
busybox-sed"

RDEPENDS:${PN} += "busybox"

inherit rpm
