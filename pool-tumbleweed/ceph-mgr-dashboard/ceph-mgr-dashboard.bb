SUMMARY = "Ceph Dashboard"
DESCRIPTION = "ceph-mgr-dashboard is a manager module, providing a web-based application \
to monitor and manage many aspects of a Ceph cluster and related components. \
See the Dashboard documentation at http://docs.ceph.com/ for details and a \
detailed feature overview."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-dashboard-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "0b103828bad8ddd4255e2ace45a8e4a8aca72ee07181bd1e3dc3a64e03724bc3579f2e7094b67bbce33754ca0237e87ee582a49a31e4e15f3105c5b3d2451ff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-dashboard"

RDEPENDS:${PN} += "/bin/sh \
ceph-grafana-dashboards \
ceph-mgr \
ceph-prometheus-alerts \
python3-CherryPy \
python3-PyJWT \
python3-Routes \
python3-Werkzeug \
python3-setuptools"

inherit rpm
