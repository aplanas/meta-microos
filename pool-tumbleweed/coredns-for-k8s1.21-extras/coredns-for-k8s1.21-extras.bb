SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "coredns-for-k8s1.21-extras-1.8.0-1.12.noarch.rpm"
RPM_HASH = "f5f80d4981ed10f90dc0b8e11ddd85679a200db914420bc57a3a6e4f6ce4993b695d7fa6996ebf5d9b04b97f969ad939304bdc38356658e009f5dd318becd1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.21-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.21-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.21"

inherit rpm
