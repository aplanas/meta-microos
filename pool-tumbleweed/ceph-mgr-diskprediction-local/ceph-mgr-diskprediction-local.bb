SUMMARY = "Ceph Manager module for predicting disk failures"
DESCRIPTION = "ceph-mgr-diskprediction-local is a ceph-mgr module that tries to predict \
disk failures using local algorithms and machine-learning databases."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-diskprediction-local-16.2.13.66+g54799ee0666-4.1.noarch.rpm"
RPM_HASH = "f2b39cd1a2cda7e7fe922b22067010ada9fae722e79e11402208da374682a5434083e897e50788760e8a09dacd079dd56e7f633f66a4ff6ddbf5599f78c298e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-diskprediction-local"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-numpy \
python3-scikit-learn \
python3-scipy"

inherit rpm
