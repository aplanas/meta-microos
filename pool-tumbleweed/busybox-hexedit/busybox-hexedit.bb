SUMMARY = "Busybox applets replacing hexedit"
DESCRIPTION = "This package contains the symlinks to replace hexedit with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-hexedit-1.36.1-28.1.noarch.rpm"
RPM_HASH = "8c337ead5315a6d1e0bcdd7f0ac646d7f8cf32e2ce79b101778964c7df0fac1f3f018992b3eb60671d1c002d65d28755d131bd17561b9a7769ffa41a9e906f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-hexedit"

RDEPENDS:${PN} += "busybox"

inherit rpm
