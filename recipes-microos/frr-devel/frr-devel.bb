SUMMARY = "Header and object files for frr development"
DESCRIPTION = "The frr-devel package contains the header and object files necessary for \
developing OSPF-API and frr applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-devel-8.4-3.1.aarch64.rpm"
RPM_HASH = "2710bd2801cdb0cb3ad6a183234c505a94b3e78d5167bc1e0caaac925ed9e6c777070ca2ac1b398654f192ac940089c87107c955d163fc86a65018c4ad55fab4"

RPROVIDES:${PN} += "frr-devel frr-devel(aarch-64)"
RDEPENDS:${PN} += "libfrr0 libfrr_pb0 libfrrcares0 libfrrfpm_pb0 libfrrospfapiclient0 libfrrsnmp0 libfrrzmq0 libmlag_pb0"

inherit rpm
