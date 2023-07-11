SUMMARY = "Ceph Manager module for predicting disk failures"
DESCRIPTION = "ceph-mgr-diskprediction-local is a ceph-mgr module that tries to predict \
disk failures using local algorithms and machine-learning databases."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "ceph-mgr-diskprediction-local-16.2.13.66+g54799ee0666-3.1.noarch.rpm"
RPM_HASH = "a688f3f7086eb599c1869bb166ede31be60004e052d5c00474465fe04fe251156bacb5bb9e0a19ecbd6607eed1ce1c713ee48a6186b740f338ece1d2d4335114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-diskprediction-local"

RDEPENDS:${PN} += "/usr/bin/sh \
ceph-mgr \
python3-numpy \
python3-scikit-learn \
python3-scipy"

inherit rpm
