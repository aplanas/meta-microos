SUMMARY = "Ceph Manager modules which are always enabled"
DESCRIPTION = "ceph-mgr-modules-core provides a set of modules which are always \
enabled by ceph-mgr."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-modules-core-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "cf6bdea3a7ec3e0feb5a8357afaeefe8ff3ee44f78e81c94bcfa1c5946fa4e707ed0d80c5c429b8c1ca49779dc3285c19729c64763802b8689e28b88bb7f2f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-modules-core"
RDEPENDS:${PN} += "python3-CherryPy python3-PyYAML python3-Werkzeug python3-bcrypt python3-dateutil python3-pecan python3-pyOpenSSL python3-requests python3-setuptools"

inherit rpm
