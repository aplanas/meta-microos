SUMMARY = "Ceph Dashboard"
DESCRIPTION = "ceph-mgr-dashboard is a manager module, providing a web-based application \
to monitor and manage many aspects of a Ceph cluster and related components. \
See the Dashboard documentation at http://docs.ceph.com/ for details and a \
detailed feature overview."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-dashboard-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "7369e03306a4c59fb76fd5721b40c72bba74c67945250f4e3bcbc56d40c9ae12eaae218aa1b6038991642a1c21ff2bf20eb0250a8d2b12dcb009a56832c916c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-dashboard"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-grafana-dashboards \
ceph-mgr \
ceph-prometheus-alerts \
python3-CherryPy \
python3-PyJWT \
python3-Routes \
python3-Werkzeug \
python3-setuptools"

inherit rpm
