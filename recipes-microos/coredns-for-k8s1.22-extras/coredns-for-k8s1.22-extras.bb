SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "coredns-for-k8s1.22-extras-1.8.4-1.9.noarch.rpm"
RPM_HASH = "d2a4673010ac1e63cec45fdaee7b05064e670a8fd6b9fbeb1159e711309b20deda1963e0233bda0a63fe117f60de2e2b9ab865ec2660869e0a936ba526ec91c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.22-extras) coredns-extras-for-k8s coredns-for-k8s1.22-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.22"

inherit rpm
