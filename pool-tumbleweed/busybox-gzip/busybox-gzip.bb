SUMMARY = "Busybox applets replacing gzip"
DESCRIPTION = "This package contains the symlinks to replace gzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gzip-1.36.1-30.1.noarch.rpm"
RPM_HASH = "9026be841fbb3aea13aef81d9607a4af7cdc9ea91952db91a3c99b04a11ff5be26bc426b1ec3fe472754e9202378351fab65918b156dbf53816f5506e495f055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-gzip"

RDEPENDS:${PN} += "/usr/bin/sh \
busybox"

inherit rpm
