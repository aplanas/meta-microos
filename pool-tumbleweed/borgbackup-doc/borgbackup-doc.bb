SUMMARY = "Documentation files for borgbackup"
DESCRIPTION = "BorgBackup is a deduplicating backup program which stores deltas. It \
supports compression and authenticated encryption as well, \
facilitating frequent backups and storing to not fully trusted \
targets. \
 \
Run borg for a commands overview and check out the docs at \
/usr/share/doc/packages/borgbackup/html/index.html."
LICENSE = "BSD-3-Clause"

PV = "1.2.4"

RPM_NAME = "borgbackup-doc-1.2.4-1.1.noarch.rpm"
RPM_HASH = "2121b041485d6f9c02309108918eaaae485cc35d96f90f4237148794e3f4db53b7c2e657d5fa9daa2096e7c7e5dbeb44c7a32b4eefd13ace44c3a159f15417f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-doc"
RDEPENDS:${PN} += ""

inherit rpm
