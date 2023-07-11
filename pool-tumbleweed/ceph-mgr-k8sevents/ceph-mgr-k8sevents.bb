SUMMARY = "Ceph Manager module to orchestrate ceph-events to kubernetes' events API"
DESCRIPTION = "ceph-mgr-k8sevents is a ceph-mgr module that sends every ceph-events \
to kubernetes' events API"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-k8sevents-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "22dbf5f82f9d7751524cb0c4b365520bcbc9b7354b9b62dda8f6887e94921cd76249a556dde6a179a84647af255b867833ba49e369155b8a90ca8ecce6bc51b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-k8sevents"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-kubernetes"

inherit rpm
