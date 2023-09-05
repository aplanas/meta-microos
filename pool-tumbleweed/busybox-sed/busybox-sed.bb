SUMMARY = "Busybox applets replacing sed"
DESCRIPTION = "This package contains the symlinks to replace sed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sed-1.36.1-29.1.noarch.rpm"
RPM_HASH = "f7678fd345b3cf1527b165911e22d310c271ffbd681f0273b28c6d2b57d8bccd8342c32a08fec64ee231a0e7d3fe8e52cf4aeed0ccf23e65251eca95962792e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sed \
busybox-sed"

RDEPENDS:${PN} += "busybox"

inherit rpm
