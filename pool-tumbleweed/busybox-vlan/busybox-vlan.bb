SUMMARY = "Busybox applets replacing vlan"
DESCRIPTION = "This package contains the symlinks to provide vlan with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-vlan-1.36.1-30.1.noarch.rpm"
RPM_HASH = "aaf05c45d739b8327313250e9ab560bfe787474d20a4e63d0d2aa4305b6c70362b090ba11514fd5792a3ed692ea7dd4434282ffb5af89665fd3f5d291178afe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-vlan"

RDEPENDS:${PN} += "busybox"

inherit rpm
