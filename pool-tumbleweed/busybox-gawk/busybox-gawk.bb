SUMMARY = "Busybox applets replacing gawk"
DESCRIPTION = "This package contains the symlinks to replace gawk with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-gawk-1.36.0-26.3.noarch.rpm"
RPM_HASH = "877376b4c7a0086a5845ac56dbce218aee1b002ebf63ddc6903ac9d0693f73d606b14193c169103158d87027d2569a8e7cdb17b7d483f9ca76c1c7ad901fd2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/awk \
busybox-gawk"
RDEPENDS:${PN} += "busybox"

inherit rpm
