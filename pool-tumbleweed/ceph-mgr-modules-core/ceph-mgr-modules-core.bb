SUMMARY = "Ceph Manager modules which are always enabled"
DESCRIPTION = "ceph-mgr-modules-core provides a set of modules which are always \
enabled by ceph-mgr."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-modules-core-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "79a93801cfb6daab1ef84854f9bdf35169eb80f1d8e5b44df0447e37d857cac4b3d61aa7754e196b52215876ea97a16c7ce366138d14210abef6db785709a66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-modules-core"

RDEPENDS:${PN} += "python3-CherryPy \
python3-PyYAML \
python3-Werkzeug \
python3-bcrypt \
python3-dateutil \
python3-pecan \
python3-pyOpenSSL \
python3-requests \
python3-setuptools"

inherit rpm
