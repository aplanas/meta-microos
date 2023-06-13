SUMMARY = "Busybox applets replacing vim"
DESCRIPTION = "This package contains the symlinks to provide vi with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-vi-1.36.0-26.3.noarch.rpm"
RPM_HASH = "c4ee420eae52592d4ce3fe977fcbf5d83c05230960dbee8c67205cc18b09afb08244c88b94cfa58d5acf1a59d2fddf65abea114bd60a1c584ef4f89cc1451291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vi"

RDEPENDS:${PN} += "busybox"

inherit rpm
