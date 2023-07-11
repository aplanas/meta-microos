SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.9.3"

RPM_NAME = "coredns-for-k8s1.25-extras-1.9.3-1.4.noarch.rpm"
RPM_HASH = "2a0f17e014f9a8942cb53fa63201967078c2f53926187ba2ef39161f54ad60e6baa5cbda3c463532be9fb4768450164b16fa2abaed446a974367f70d5f754242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-coredns-for-k8s1.25-extras \
coredns-extras-for-k8s \
coredns-for-k8s1.25-extras"

RDEPENDS:${PN} += "/usr/bin/sh \
coredns-for-k8s1.25"

inherit rpm
