SUMMARY = "Ceph Manager module for cephadm-based orchestration"
DESCRIPTION = "ceph-mgr-cephadm is a ceph-mgr module for orchestration functions using \
the integrated cephadm deployment tool management operations."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-cephadm-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "c749c9120a2c17074654592870c21d8d8de4d09df3d04d82730b7c01b7c1e54a8ad5aba781422ea646f03eb264803161b391760bed837bd36ab3b8c7cf7ff33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-cephadm"
RDEPENDS:${PN} += "/bin/sh ceph-mgr cephadm openssh python3-Jinja2 python3-remoto"

inherit rpm
