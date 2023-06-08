SUMMARY = "Ceph Manager module for Rook-based orchestration"
DESCRIPTION = "ceph-mgr-rook is a ceph-mgr module for orchestration functions using \
a Rook backend."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-mgr-rook-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "41222871ed3f290094d8014d162030c644228b9b20d4298e04773c4a21e3076da1aa8e0ca3b85ae09b431a8e732d0dccb95e163f19c937749e8eaec2866ef53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-rook"
RDEPENDS:${PN} += "/bin/sh ceph-mgr python3-jsonpatch python3-kubernetes"

inherit rpm
