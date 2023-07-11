SUMMARY = "Backup scripts"
DESCRIPTION = "Shell scripts for system backup/restore"
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-backup-scripts-1.34-10.4.noarch.rpm"
RPM_HASH = "69a04e2afdba9b7b16579ecddf3e782bfc33e6dac599ce2aec9499788074dd1b41dbfe8b158ff4eb6b476a7c6fbcc2d994b43eba947d4888add1d8ecac574cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tar-backup-scripts \
tar-backup-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
tar"

inherit rpm
