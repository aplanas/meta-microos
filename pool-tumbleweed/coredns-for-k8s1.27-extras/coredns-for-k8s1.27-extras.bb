SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "coredns-for-k8s1.27-extras-1.10.1-1.2.noarch.rpm"
RPM_HASH = "8b242003bc13f2da2877bfdc53df02709ff1a7ec76b270c48128336405137f850faeeb2a62e7007b9d6e24cc749807ec7082dc56bad052bb3f92cbc60ec50d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.27-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.27-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.27"

inherit rpm
