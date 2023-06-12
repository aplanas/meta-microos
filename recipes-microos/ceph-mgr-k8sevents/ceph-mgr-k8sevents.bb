SUMMARY = "Ceph Manager module to orchestrate ceph-events to kubernetes' events API"
DESCRIPTION = "ceph-mgr-k8sevents is a ceph-mgr module that sends every ceph-events \
to kubernetes' events API"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-k8sevents-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "bdbaa2afe8edb2f351a9b926f572f1453364d350451baed2ce079b7dd5e5196bdf7cc138a69a90608a4f2a42552b4bb4073f78e963eb5da21fd0524aefa23a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-k8sevents"
RDEPENDS:${PN} += "/bin/sh ceph-mgr python3-kubernetes"

inherit rpm
