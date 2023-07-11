SUMMARY = "Tools for nNDPI"
DESCRIPTION = "nDPI is a ntop-maintained superset of the OpenDPI library. It extends \
the original library by adding new protocols that are otherwise \
available only on the paid version of OpenDPI. \
 \
This package contains the ndpiReader binary."
LICENSE = "LGPL-3.0-only"

PV = "4.0"

RPM_NAME = "ndpi-tools-4.0-1.9.aarch64.rpm"
RPM_HASH = "fd8542323f1bc773586ca60894a4b95faaa8c58cfb4407d6d0f9a90d38e03bc7fdbe3d38118726e2af88465e3f178015d5be06b557e4aaa7a66857d06e929955"

RPROVIDES:${PN} += "ndpi-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpcap.so.1"

inherit rpm
