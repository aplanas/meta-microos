SUMMARY = "C++ development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
Development files for the C++ interface to the OpenWSMAN client library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_clientpp-devel-2.7.2-2.5.aarch64.rpm"
RPM_HASH = "47e78906e10916308b496ef40b7256ede888e98bebf0f3cd7dbb878d9a4cdfa5b04333057d704ec76de2c118e888c2ddfed2f7dded525d89887f52fc94a5ef16"

RPROVIDES:${PN} += "libwsman_clientpp-devel \
libwsman_clientpp-devel(aarch-64)"

RDEPENDS:${PN} += "libwsman-devel \
libwsman_clientpp1"

inherit rpm
