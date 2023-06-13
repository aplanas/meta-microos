SUMMARY = "Non-ABI stable API for the Qt 6 CoAP library"
DESCRIPTION = "This package provides private headers of libQt6Coap that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "95083d398a22511bb7b3660583f645f1e6567bab38eb57ba42a0258e6d0714b0edc6639cdfca34d53cf9a8615fa200f6d158439c25d4e249420db776e0ddf780"

RPROVIDES:${PN} += "qt6-coap-private-devel \
qt6-coap-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Coap)"

inherit rpm
