SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.25-extras-1.9.3-1.3.noarch.rpm"
RPM_HASH = "f0ebfbe7313810f382810a17f839a4390f4c00ed898eeb296ea1447f180c78c2930e50e87d74180c7ad6ce651c25b6b684404c9e77093814c479a33cf518bb33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.25-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.25-extras"

RDEPENDS:${PN} += "/bin/sh \
coredns-for-k8s1.25"

inherit rpm
