SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.26-extras-1.9.3-1.3.noarch.rpm"
RPM_HASH = "0236972d10e4c0007db965c789e26a172642fca0eec963eabd64f32873e477376e9623fe82b8967c55445300ec12d48faf372c7dd078c21ab819cac963c5a9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.26-extras) coredns-extras-for-k8s coredns-for-k8s1.26-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.26"

inherit rpm
