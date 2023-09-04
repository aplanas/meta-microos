SUMMARY = "Ceph Manager module for cephadm-based orchestration"
DESCRIPTION = "ceph-mgr-cephadm is a ceph-mgr module for orchestration functions using \
the integrated cephadm deployment tool management operations."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-cephadm-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "dc981e9b60bd9e71cc39fef7c305c9dd07ce3f13da1c835c7daf075d21d5158812f5632da3571096719c0626089b25d798286e570fc2237ad727c340b9cc712e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-cephadm"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
cephadm \
openssh \
python3-Jinja2 \
python3-remoto"

inherit rpm
