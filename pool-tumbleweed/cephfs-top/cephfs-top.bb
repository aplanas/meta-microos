SUMMARY = "top(1) like utility for Ceph Filesystem"
DESCRIPTION = "This package provides a top(1) like utility to display Ceph Filesystem metrics \
in realtime."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "cephfs-top-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "53982dbf4900d2b5cad4a49813734ed56aa339576df3863731eaf9a7d21d95d355bc9ea0cb33ffe48d7e207c2c0834af99f9fec5bda2f324e224c3d2fdad114d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cephfs-top \
python3.11dist-cephfs-top \
python3dist-cephfs-top"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-rados"

inherit rpm
