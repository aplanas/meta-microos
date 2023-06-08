SUMMARY = "Ceph Manager module for predicting disk failures"
DESCRIPTION = "ceph-mgr-diskprediction-local is a ceph-mgr module that tries to predict \
disk failures using local algorithms and machine-learning databases."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "ceph-mgr-diskprediction-local-16.2.11.65+g8b7e6fc0182-1.1.noarch.rpm"
RPM_HASH = "c830e30bbc6a8fdcd7e6004d4ba9a55c2f408130abaef32ed436b1ef1d315440b270801e07086100935a795ef783c14a511bcfcb27cbfde4b9d8c8ee5f181272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-mgr-diskprediction-local"
RDEPENDS:${PN} += "/bin/sh ceph-mgr python3-numpy python3-scikit-learn python3-scipy"

inherit rpm
