SUMMARY = "Backup scripts"
DESCRIPTION = "Shell scripts for system backup/restore"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-backup-scripts-1.34-12.1.noarch.rpm"
RPM_HASH = "e42ba3abc31f778fc00104c2727a2bb0d65cc142fee4d55fad7edd004ebd3dabe327e7e7724fe27c9d5208b79098e7c827a89a01056d7d26309cce8161595b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tar-backup-scripts \
tar-backup-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
tar"

inherit rpm
