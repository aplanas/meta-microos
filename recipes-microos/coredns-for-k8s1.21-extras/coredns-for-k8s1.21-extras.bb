SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.0"

RPM_NAME = "coredns-for-k8s1.21-extras-1.8.0-1.10.noarch.rpm"
RPM_HASH = "4c561a6ed136433e82707778418ef04624b3a6264d0b02799f8cfc474f3b623d2b9617de66c83c2809ea73257204dd9372d003e7084def4bfd58785bd7cdc07e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.21-extras) coredns-extras-for-k8s coredns-for-k8s1.21-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.21"

inherit rpm
