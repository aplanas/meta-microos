SUMMARY = "Ceph Manager module for cephadm-based orchestration"
DESCRIPTION = "ceph-mgr-cephadm is a ceph-mgr module for orchestration functions using \
the integrated cephadm deployment tool management operations."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-mgr-cephadm-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "8784a21f88b911b70350b09d860c06919a35599ccf9b4106bd78f7a8d7c5a8f3c274dc133c53b7dd5b70552e02040a5981b836750a75b3540ed58594eb695b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-cephadm"
RDEPENDS:${PN} += "/bin/sh ceph-mgr cephadm openssh python3-Jinja2 python3-remoto"

inherit rpm
