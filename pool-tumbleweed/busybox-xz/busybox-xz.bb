SUMMARY = "Busybox applets replacing xz"
DESCRIPTION = "This package contains the symlinks to replace xz with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-xz-1.36.1-28.1.noarch.rpm"
RPM_HASH = "e8943ca757f0042cf4e35779c3ee8ed96379e31c6438e0e6898b9ca9b6ddecc39d1ce3de26d883da02fbde07b0677c68df3a3f4c598a720c56ef0b2ab3718ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-xz"

RDEPENDS:${PN} += "busybox"

inherit rpm
