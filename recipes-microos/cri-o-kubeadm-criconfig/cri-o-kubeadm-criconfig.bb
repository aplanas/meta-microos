SUMMARY = "CRI-O container runtime configuration for kubeadm"
DESCRIPTION = "This package provides the CRI-O container runtime configuration for kubeadm"
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-kubeadm-criconfig-1.24.3-1.3.aarch64.rpm"
RPM_HASH = "ea07986df332a9052a379c6e5650446636ac22d038b798df56d8d95b49a3cf284333ae244b41ca3c58ecac5431fe2818c64720c498e5e4f6a645646744acda70"

RPROVIDES:${PN} += "cri-o-kubeadm-criconfig cri-o-kubeadm-criconfig(aarch-64) kubernetes-kubeadm-criconfig"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup kubernetes-kubeadm-provider"

inherit rpm
