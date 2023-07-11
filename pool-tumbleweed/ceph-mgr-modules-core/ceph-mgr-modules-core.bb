SUMMARY = "Ceph Manager modules which are always enabled"
DESCRIPTION = "ceph-mgr-modules-core provides a set of modules which are always \
enabled by ceph-mgr."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-modules-core-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "9db8bc634b9f7399947aee3459512fa777ea12f425c2982cf764a4a6164e16527660304a1f88993a719f1cc768096bcc35335d3e5973e78a196127bb20dd8864"
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
