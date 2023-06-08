SUMMARY = "Utility to bootstrap Ceph clusters"
DESCRIPTION = "Utility to bootstrap a Ceph cluster and manage Ceph daemons deployed \
with systemd and podman."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "cephadm-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "cda1340d419e9ee637bfffe045fb076967bca2a2b5f9d18467539464e8aaeac574290eaea58a45ba7d0a002044fae195ea1eb52464341085710da97f931ec3d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephadm config(cephadm)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 lvm2 python3"

inherit rpm
