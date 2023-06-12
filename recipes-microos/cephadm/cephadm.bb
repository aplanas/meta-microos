SUMMARY = "Utility to bootstrap Ceph clusters"
DESCRIPTION = "Utility to bootstrap a Ceph cluster and manage Ceph daemons deployed \
with systemd and podman."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephadm-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "827bccc742bcaf7a6a4de23049b41d29ab17b056e021bc2289687d63c541f99972da06577b9a92f5662d8323dc173c64bc7bfd9add500307d31b03191a1beaa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephadm config(cephadm)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 lvm2 python3"

inherit rpm
