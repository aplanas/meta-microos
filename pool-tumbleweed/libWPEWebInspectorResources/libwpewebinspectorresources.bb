SUMMARY = "WPEWebInspectorResources tool"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1"

PV = "2.40.3"

RPM_NAME = "libWPEWebInspectorResources-2.40.3-1.2.aarch64.rpm"
RPM_HASH = "e52d979058848f1aadb1563303447bd0fd74a50da2f5238b082f04e87f3048efae34334ee0cd83da2a57f11e61a947370200a58e5c929281291ecf66f5d60fc0"

RPROVIDES:${PN} += "libWPEWebInspectorResources \
libWPEWebInspectorResources.so"

RDEPENDS:${PN} += "libgio-2.0.so.0"

inherit rpm
