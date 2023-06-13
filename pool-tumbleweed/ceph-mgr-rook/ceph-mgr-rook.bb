SUMMARY = "Ceph Manager module for Rook-based orchestration"
DESCRIPTION = "ceph-mgr-rook is a ceph-mgr module for orchestration functions using \
a Rook backend."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-rook-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "8d540911816c53a10a021fb9d29429363a7cdcf49ec1f303aad15adc47587c70d58e7b5db7e7ab2fc8ece99097582f340fc58bbaeab6eb2dec7d27cc7d542ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-rook"

RDEPENDS:${PN} += "/bin/sh \
ceph-mgr \
python3-jsonpatch \
python3-kubernetes"

inherit rpm
