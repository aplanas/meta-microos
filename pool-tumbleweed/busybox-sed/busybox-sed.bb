SUMMARY = "Busybox applets replacing sed"
DESCRIPTION = "This package contains the symlinks to replace sed with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-sed-1.36.1-28.1.noarch.rpm"
RPM_HASH = "4644c296d879c8c16338921e29d6b0db8d4c5243bbe3927d1c70bc7354d8108eda1d79fe2d6f5107d2596ae07bf7a347c2d6c57ce13087a94c9ea6fd2bd838f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sed \
busybox-sed"

RDEPENDS:${PN} += "busybox"

inherit rpm
