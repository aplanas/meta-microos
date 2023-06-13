SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "coredns-for-k8s1.22-extras-1.8.4-1.10.noarch.rpm"
RPM_HASH = "a6a5bc28c134445804f801c476b14830666d8dd02b760f369551176c3549a6efec1fd715f3fb599ab5d04a7758031fed50ae1cb6b737d3b14424a3878f7df210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.22-extras) \
coredns-extras-for-k8s \
coredns-for-k8s1.22-extras"

RDEPENDS:${PN} += "/bin/sh \
coredns-for-k8s1.22"

inherit rpm
