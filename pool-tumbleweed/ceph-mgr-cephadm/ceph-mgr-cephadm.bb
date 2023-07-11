SUMMARY = "Ceph Manager module for cephadm-based orchestration"
DESCRIPTION = "ceph-mgr-cephadm is a ceph-mgr module for orchestration functions using \
the integrated cephadm deployment tool management operations."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-cephadm-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "861631ec61bab4289460673497665127caf09ba0d6d0b519bbc4681b4785e8026304b9b45243d8756c314b2e2939b0be1da7a6b30d388267a37210c9f41ebffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-cephadm"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
cephadm \
openssh \
python3-Jinja2 \
python3-remoto"

inherit rpm
