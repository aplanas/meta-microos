SUMMARY = "Ceph Manager module for Rook-based orchestration"
DESCRIPTION = "ceph-mgr-rook is a ceph-mgr module for orchestration functions using \
a Rook backend."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-rook-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "d9a49d5cd754258554e0e07f6c226f0155381ca45b679791ea0d5220a9a60a10b2cc20e70b46a418d4da0eb764781ba8a946e0bcc9e5c6b7fbb08a69328c75bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-rook"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-jsonpatch \
python3-kubernetes"

inherit rpm
