SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.26-extras-1.9.3-1.4.noarch.rpm"
RPM_HASH = "189361d1984a96ec5e0558fd94a08eff5959a1d859efe07e54f0387fff6982d16a2c6ff516823b6f32e6af9ce9a8a914e8720696e6a8c6126b89666d01dbcd51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.26-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.26-extras"

RDEPENDS:${PN} += "/bin/sh \
coredns-for-k8s1.26"

inherit rpm
