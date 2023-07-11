SUMMARY = "Utility to bootstrap Ceph clusters"
DESCRIPTION = "Utility to bootstrap a Ceph cluster and manage Ceph daemons deployed \
with systemd and podman."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephadm-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "2dfe2bfb2fdc6fbdf7d8be56c416bd1b769672017e0240e383fe5791db8443ca6749d02acfb05296f2d947c2a1de52a0369a28e4df3d54bea59d20e0fac2217e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephadm \
config-cephadm"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
lvm2 \
python3"

inherit rpm
