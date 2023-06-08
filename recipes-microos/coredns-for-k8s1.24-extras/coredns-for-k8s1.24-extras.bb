SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.24-extras-1.8.6-1.5.noarch.rpm"
RPM_HASH = "0aec074c94c68e3c904eab84ac4362d97aa551e9c08fbf97ec92af234afabf268b94a9d0849654bccb69186141d852ae744173501f7f5157abf21ec087cb979b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.24-extras) coredns-extras-for-k8s coredns-for-k8s1.24-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.24"

inherit rpm
