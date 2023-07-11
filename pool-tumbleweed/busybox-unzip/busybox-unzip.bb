SUMMARY = "Busybox applets replacing unzip"
DESCRIPTION = "This package contains the symlinks to replace unzip with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-unzip-1.36.1-27.1.noarch.rpm"
RPM_HASH = "ee251b7959d0d4a8cbe7272222831b42fbf935026e2c078a8f89734a855b58b1711be0cd8bee58151df07733a2bd921f0340702a32bfa28b9d0a4bf01fddb7b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-unzip"

RDEPENDS:${PN} += "busybox"

inherit rpm
