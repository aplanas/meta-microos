SUMMARY = "Header and object files for frr development"
DESCRIPTION = "The frr-devel package contains the header and object files necessary for \
developing OSPF-API and frr applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-devel-8.4-5.1.aarch64.rpm"
RPM_HASH = "96683b3b4ce2666e52216c4893060f33e65c38a15c7c0e80e06e3e3041f491fa6cffa10423377eb6c0356d0f2cf50c934cd9a2e474b4cbc04db64bb7a9bc7fa1"

RPROVIDES:${PN} += "frr-devel"

RDEPENDS:${PN} += "libfrr-pb0 \
libfrr0 \
libfrrcares0 \
libfrrfpm-pb0 \
libfrrospfapiclient0 \
libfrrsnmp0 \
libfrrzmq0 \
libmlag-pb0"

inherit rpm
