SUMMARY = "Scripts for btrfs periodic maintenance tasks"
DESCRIPTION = "Scripts for btrfs maintenance tasks like periodic scrub, balance, trim or defrag \
on selected mountpoints or directories. Hints for periodic snapshot tuning (eg. \
for snapper)."
LICENSE = "GPL-2.0-only"

PV = "0.5"

RPM_NAME = "btrfsmaintenance-0.5-2.8.noarch.rpm"
RPM_HASH = "feabf298d4579009a0dc3783301ef452574fb8ee10799205ef48b72dba75b7b579048b3bd4b135801920913f22c2a679a2664885d403ab88364fe6a43547af15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "btrfsmaintenance"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
btrfsprogs"

inherit rpm
