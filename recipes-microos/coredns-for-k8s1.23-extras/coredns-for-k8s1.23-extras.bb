SUMMARY = "Extra components for the coredns package"
DESCRIPTION = "Extra components for the coredns package, to make coredns usable in a \
non-containerized environment (man pages, configuration, unit file)."
LICENSE = "Apache-2.0"

PV = "1.8.6"

RPM_NAME = "coredns-for-k8s1.23-extras-1.8.6-1.9.noarch.rpm"
RPM_HASH = "58102b6e175d42600b5f2ee9426218c6c91716853799f44a266bf5c20d3bad05875e3e9ccdee33508e9160d9519a7e7670e3ea51c0cdd32bf4230a8dc2c78a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(coredns-for-k8s1.23-extras) coredns-extras-for-k8s coredns-for-k8s1.23-extras"
RDEPENDS:${PN} += "/bin/sh coredns-for-k8s1.23"

inherit rpm
