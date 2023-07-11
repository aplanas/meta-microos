SUMMARY = "Ceph Manager module for Rook-based orchestration"
DESCRIPTION = "ceph-mgr-rook is a ceph-mgr module for orchestration functions using \
a Rook backend."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-rook-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "d6342636ade7a1f4712cca407e76b36ebdf7879c04a27cdd08ce19ed2f00b3e2455c9e204fe46d3073e56ece2e403ce5fe0b4d9365ec596ff422387916f70fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-rook"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-jsonpatch \
python3-kubernetes"

inherit rpm
