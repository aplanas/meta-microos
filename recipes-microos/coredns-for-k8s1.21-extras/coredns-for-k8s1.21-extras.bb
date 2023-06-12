SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "coredns-for-k8s1.21-extras-1.8.0-1.11.noarch.rpm"
RPM_HASH = "0df62ee84a28b78f2673e1843178da8ccf607e6f608c7259f5ab19e51a95628e1ff093a97bf973dbaf138c1749d99562c6df255912830e743c5124d823746902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.21-extras) coredns-extras-for-k8s coredns-for-k8s1.21-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.21"

inherit rpm
