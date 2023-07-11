SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.23-extras-1.8.6-1.11.noarch.rpm"
RPM_HASH = "25f5297b7b2a0d9646c36a8d64ffd288617e168c05f0094c20b8a88c87b6e0b10348246158992c26904d7f870097c086eec3e2093d6946d7c4903a905fdbace9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.23-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.23-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.23"

inherit rpm
