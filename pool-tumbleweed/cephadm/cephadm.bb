SUMMARY = "Utility to bootstrap Ceph clusters"
DESCRIPTION = "Utility to bootstrap a Ceph cluster and manage Ceph daemons deployed \
with systemd and podman."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephadm-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "fd9768f3051f44139c25fa46cc257ef36cd31dcf94fe4d121d13da6a2cbdf0fcf4e879f011f9d71c0ef7905efb2e1413e065ae38159c9110eaa7b81afa9bce8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephadm \
config-cephadm"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
lvm2 \
python3"

inherit rpm
