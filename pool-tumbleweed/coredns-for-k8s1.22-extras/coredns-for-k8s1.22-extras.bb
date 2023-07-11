SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "coredns-for-k8s1.22-extras-1.8.4-1.11.noarch.rpm"
RPM_HASH = "1af906885978c480d84788ff32d0190232dfdb26f90deecdab353f4477c251ed35967ab33e579f07392febe4b692e0ae492d01993a43833853571f0d070235d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.22-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.22-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.22"

inherit rpm
