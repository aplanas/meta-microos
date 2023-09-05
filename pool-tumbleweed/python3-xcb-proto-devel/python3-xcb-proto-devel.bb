SUMMARY = "Python libraries mandatory for XML-XCB Development"
DESCRIPTION = "Language-independent Python libraries that used to parse an XML description \
and create objects used by Python code generators in individual language \
bindings."
LICENSE = "X11"

PV = "7.6_1.16.0"

RPM_NAME = "python3-xcb-proto-devel-7.6_1.16.0-1.1.aarch64.rpm"
RPM_HASH = "db88bb3a2a215f76ec6d75b450e513438e66ead9fcbe1f448138ffcce554b3ee42cef0fcbc5dbd97938f58e6cdc536e2cf4039145a01afc5f1544d0f0eac0f53"

RPROVIDES:${PN} += "python3-xcb-proto-devel"

RDEPENDS:${PN} += "python-abi"

inherit rpm
