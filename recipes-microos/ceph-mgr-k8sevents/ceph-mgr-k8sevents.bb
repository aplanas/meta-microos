SUMMARY = "Ceph Manager module to orchestrate ceph-events to kubernetes' events API"
DESCRIPTION = "ceph-mgr-k8sevents is a ceph-mgr module that sends every ceph-events \
to kubernetes' events API"
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-mgr-k8sevents-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "abbb2d8d4891575cf4c07cd44aa1373e0893e0d419d680170cba7f5020a105d0b14074ff28f566db4143f1697bbda9d0e619e7c682c98e9893188685541b0edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-k8sevents"
RDEPENDS:${PN} += "/bin/sh ceph-mgr python3-kubernetes"

inherit rpm
