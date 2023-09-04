SUMMARY = "Ceph Manager module to orchestrate ceph-events to kubernetes' events API"
DESCRIPTION = "ceph-mgr-k8sevents is a ceph-mgr module that sends every ceph-events \
to kubernetes' events API"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-k8sevents-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "e8a8164b6c67b1afff9a32c3334ec20662e485ed51b52c8fe22191723b67a5b645f1df61aa2e78c79e594dfb14592202e957be6a0c4d951a90a2abdf01af7ae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-k8sevents"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-kubernetes"

inherit rpm
