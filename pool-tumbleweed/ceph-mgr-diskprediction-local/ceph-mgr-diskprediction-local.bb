SUMMARY = "Ceph Manager module for predicting disk failures"
DESCRIPTION = "ceph-mgr-diskprediction-local is a ceph-mgr module that tries to predict \
disk failures using local algorithms and machine-learning databases."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-diskprediction-local-16.2.13.66+g54799ee0666-2.1.noarch.rpm"
RPM_HASH = "190196b111739b0b22f9357b840b0de6529203f7118cbbcfc57f2e2abb6416036c62d920ca692de3eb2415267b5ed7285df5be4a5af17fc3c8006c659dadeefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-diskprediction-local"
RDEPENDS:${PN} += "/bin/sh \
ceph-mgr \
python3-numpy \
python3-scikit-learn \
python3-scipy"

inherit rpm
