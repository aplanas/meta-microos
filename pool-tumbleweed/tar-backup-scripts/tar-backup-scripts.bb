SUMMARY = "Backup scripts"
DESCRIPTION = "Shell scripts for system backup/restore"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-backup-scripts-1.34-10.3.noarch.rpm"
RPM_HASH = "5a59d3d780dbde827cd5fca82743c4b22fe368cbc3950fdc22e6de6fb023bb048ecdc91eb032818a07a0fcbdea24ec37db6fe5bca50959dbb996cc361e234248"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tar-backup-scripts \
tar-backup-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
tar"

inherit rpm
