SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.25-extras-1.9.3-1.2.noarch.rpm"
RPM_HASH = "aadda004fab1bc456cfe951b9714988e77387aed47d5842e2881c515efab423b77a7cc246e27905e97a51725db4253d008da733b584da67d38fd74d2ec8b5fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.25-extras) coredns-extras-for-k8s coredns-for-k8s1.25-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.25"

inherit rpm
