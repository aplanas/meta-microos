SUMMARY = "Ceph CSI helm charts"
DESCRIPTION = "Helm charts for CephFS and RBD access through ceph-csi."
LICENSE = "Apache-2.0"

PV = "3.3.1+git0.a07260f19"

RPM_NAME = "ceph-csi-helm-charts-3.3.1+git0.a07260f19-1.13.noarch.rpm"
RPM_HASH = "1b52498d9e8c1d2e3eca156ae3eb62c545a5dfbe2c879423fa9c7666ab17973ca6b3c70693563e798277190845d00ab5b2c4c3ae7caa9d878db66ee7495b8def"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ceph-csi-helm-charts"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
