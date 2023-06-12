SUMMARY = "top(1) like utility for Ceph Filesystem"
DESCRIPTION = "This package provides a top(1) like utility to display Ceph Filesystem metrics \
in realtime."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-top-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "5257fdc72776d2dcf3f7c90a67b07ead9dca123c4978e42ef6718fd5545c1e633bfdc8f102f9281a1f920d9556327ed819df0629d9a93d094284d96e44136528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephfs-top \
python3.10dist(cephfs-top) \
python3dist(cephfs-top)"
RDEPENDS:${PN} += "/usr/bin/python3.10 \
python3-rados"

inherit rpm
