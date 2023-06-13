SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.10.1"

RPM_NAME = "coredns-for-k8s1.27-extras-1.10.1-1.1.noarch.rpm"
RPM_HASH = "e4ff24acf07667ad8093eaeb61d55af8a2352da6417ac49dfc2f46a36773d5cbe58184344da81d1fc59bd64312633e9630858c541a9c0bc91d163f0377605d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.27-extras) \
coredns-extras-for-k8s \
coredns-for-k8s1.27-extras"

RDEPENDS:${PN} += "/bin/sh \
coredns-for-k8s1.27"

inherit rpm
