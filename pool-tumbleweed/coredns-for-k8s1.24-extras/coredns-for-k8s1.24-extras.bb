SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.24-extras-1.8.6-1.6.noarch.rpm"
RPM_HASH = "9c51a007ad72166d07cb01e9ed6fdff7506a907721af8babc27b6d10bd1166e5e783a2269b9831937b7763ef606ffc1e11971e20d99bbfef3d324c9c82260eb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.24-extras) \
coredns-extras-for-k8s \
coredns-for-k8s1.24-extras"

RDEPENDS:${PN} += "/bin/sh \
coredns-for-k8s1.24"

inherit rpm
