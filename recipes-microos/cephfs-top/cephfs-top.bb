SUMMARY = "top(1) like utility for Ceph Filesystem"
DESCRIPTION = "This package provides a top(1) like utility to display Ceph Filesystem metrics \
in realtime."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "cephfs-top-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "bef2a9462d720de6f0135b29f15855038f8ca69c6c497cd50352e6e6fdb0c542a020889aee11deef5b8523d9f9264c336c9bc2b57a4dbd9d2e3d0aa84e8db573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephfs-top python3.10dist(cephfs-top) python3dist(cephfs-top)"
RDEPENDS:${PN} += "/usr/bin/python3.10 python3-rados"

inherit rpm
