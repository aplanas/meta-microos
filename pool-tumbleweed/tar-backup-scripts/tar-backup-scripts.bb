SUMMARY = "Backup scripts"
DESCRIPTION = "Shell scripts for system backup/restore"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-backup-scripts-1.34-11.1.noarch.rpm"
RPM_HASH = "1f6fc79546465457883f3d6ebae1baf572e4e1b785ca731d2576d9b69aab3af97554a6aef2db17b2192ac5aeef14bd9894ad1b6f041dbd26aa9c1202117e6803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tar-backup-scripts \
tar-backup-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
tar"

inherit rpm
