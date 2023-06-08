SUMMARY = "Ceph Dashboard"
DESCRIPTION = "ceph-mgr-dashboard is a manager module, providing a web-based application \
to monitor and manage many aspects of a Ceph cluster and related components. \
See the Dashboard documentation at http://docs.ceph.com/ for details and a \
detailed feature overview."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-mgr-dashboard-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "2f136a4f5035de8fc038ada56bf5d63c2ba880470dffc8ca75afb6ed3eb995e907bcccd1af72ed7913b2ab098d5f4a7cb7751eeb819f33d562c9b841752969fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-dashboard"
RDEPENDS:${PN} += "/bin/sh ceph-grafana-dashboards ceph-mgr ceph-prometheus-alerts python3-CherryPy python3-PyJWT python3-Routes python3-Werkzeug python3-setuptools"

inherit rpm
