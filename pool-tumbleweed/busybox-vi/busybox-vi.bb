SUMMARY = "Busybox applets replacing vim"
DESCRIPTION = "This package contains the symlinks to provide vi with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vi-1.36.1-30.1.noarch.rpm"
RPM_HASH = "018060272c72c0ae023e19bf279404e3ea0dfcf6c0896eb76370908ac24d4f4e6e2525aba5518d1376260c63bb31fbf19a843fcded9ce0c6156de10a811ad496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vi"

RDEPENDS:${PN} += "busybox"

inherit rpm
