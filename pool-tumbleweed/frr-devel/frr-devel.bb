SUMMARY = "Header and object files for frr development"
DESCRIPTION = "The frr-devel package contains the header and object files necessary for \
developing OSPF-API and frr applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "frr-devel-8.4-4.1.aarch64.rpm"
RPM_HASH = "74cb2cf382c8e3b4c8efd1c26d8bde38a4ba14dc509435bef6b5a8761d428b24ac9971010a19b25a55312130d507437441c9e1f0acad5c82745a542c021595b7"

RPROVIDES:${PN} += "frr-devel \
frr-devel(aarch-64)"

RDEPENDS:${PN} += "libfrr0 \
libfrr_pb0 \
libfrrcares0 \
libfrrfpm_pb0 \
libfrrospfapiclient0 \
libfrrsnmp0 \
libfrrzmq0 \
libmlag_pb0"

inherit rpm
