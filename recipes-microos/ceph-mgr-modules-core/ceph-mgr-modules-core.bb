SUMMARY = "Ceph Manager modules which are always enabled"
DESCRIPTION = "ceph-mgr-modules-core provides a set of modules which are always \
enabled by ceph-mgr."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-mgr-modules-core-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "8861dd51bd7d1beaf79a940d6cd5fd34497a20f1fde6b523f704f2240d63d8d53416ea63ac7b57693555d5cf3248e3c70b1b49281476c4bb5f2b2c85ac768893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-modules-core"
RDEPENDS:${PN} += "python3-CherryPy python3-PyYAML python3-Werkzeug python3-bcrypt python3-dateutil python3-pecan python3-pyOpenSSL python3-requests python3-setuptools"

inherit rpm
