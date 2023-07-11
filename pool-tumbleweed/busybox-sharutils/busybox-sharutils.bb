SUMMARY = "Busybox applets replacing sharutils"
DESCRIPTION = "This package contains the symlinks to replace sharutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sharutils-1.36.1-27.1.noarch.rpm"
RPM_HASH = "8435d50eeb7d118b083789f3870efe2bcd8c6ffe24a2bbf6e0b932af412524d122d6703df6fd71acf63a8c1abdfe6072deed1f43f68bec697b51064f9ce7293c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-sharutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
