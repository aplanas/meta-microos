SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "openSUSE-release-appliance-hyperv-20230707-1726.1.aarch64.rpm"
RPM_HASH = "b379c34b0e721828f50294380867edb678d117b83f371e50a438a390a223ebcc9caccbb184e37f0a15532c77a0ce692956b1e6e5a19d29bf7124f52625038e41"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
