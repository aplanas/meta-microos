SUMMARY = "Busybox applets replacing gawk"
DESCRIPTION = "This package contains the symlinks to replace gawk with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-gawk-1.36.1-30.1.noarch.rpm"
RPM_HASH = "a71510c39f4f02517b728473cdc22bde8dde6cbb4f2faffffb86bfe925b5e69bbd9ce52ac4db9970ec512d347f3ee8c9f69726711d7f3807c42048e88da81fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/awk \
busybox-gawk"

RDEPENDS:${PN} += "busybox"

inherit rpm
