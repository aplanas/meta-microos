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

RPM_NAME = "borgbackup-doc-1.2.4-1.3.noarch.rpm"
RPM_HASH = "eabc2eb76eaf372576a2622709d19cf0e0ef5c54723b224ef6779bd1df89b07dadc4cfc330fd0b6999682c0739ef10ad828335d2fb99308d0238df48c0901a5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "borgbackup-doc"

RDEPENDS:${PN} += ""

inherit rpm
