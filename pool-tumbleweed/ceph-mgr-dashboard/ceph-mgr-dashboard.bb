SUMMARY = "Ceph Dashboard"
DESCRIPTION = "ceph-mgr-dashboard is a manager module, providing a web-based application \
to monitor and manage many aspects of a Ceph cluster and related components. \
See the Dashboard documentation at http://docs.ceph.com/ for details and a \
detailed feature overview."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-dashboard-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "9447b4184fa6ccb41f306985c72bb96208bc71c9c1cf6456a9e8c38f07bc31a74adbc19c32f0465c4820c0da04ab8b108e2b64549f51d3484b71151c38b6c7ca"
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
