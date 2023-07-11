SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.24-extras-1.8.6-1.7.noarch.rpm"
RPM_HASH = "33075f4451ec58dc0a1e61ccd309fdf495d975b68c8bd09370d809507464873ff5f0defb51e74acef28acf43592a5d85887b5a2e27f593689c48114a05065bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.24-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.24-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.24"

inherit rpm
