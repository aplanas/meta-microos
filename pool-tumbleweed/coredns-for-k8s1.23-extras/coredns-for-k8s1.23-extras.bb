SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.23-extras-1.8.6-1.10.noarch.rpm"
RPM_HASH = "5c68bb8c5e2ad99e44c1d28e989bfe52de75d1234047dc7de4305cd72f0239e01cfe000021b439ab8ea95719e03a12398d2091afdca08d11a6a2ffb39ba67fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.23-extras) \
coredns-extras-for-k8s \
coredns-for-k8s1.23-extras"

RDEPENDS:${PN} += "/bin/sh \
coredns-for-k8s1.23"

inherit rpm
