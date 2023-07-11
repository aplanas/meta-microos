SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.26-extras-1.9.3-1.5.noarch.rpm"
RPM_HASH = "a3c64ec4078765c1f75c1fae380bf465555693ac06a288ef9d617b62357f983136cc6161a05bfb44e82f6c3ab6fb16f88bac73596294ed7e92d994670e4904ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.26-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.26-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.26"

inherit rpm
