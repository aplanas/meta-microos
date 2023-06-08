SUMMARY = "Documentation for the BIRD Internet Routing Daemon"
DESCRIPTION = "BIRD is an implementation for routing Internet Protocol packets. \
 \
This package holds the HTML documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "bird-doc-2.13-1.1.aarch64.rpm"
RPM_HASH = "85b82815b01a8c8904147fe32ef8e7411f71f2325be451bf7cdd33a4a2d9576526e853df07a3a40d6388d7a2e33effc9c905a5bde53a42cb1f4a28ea1a1788b4"

RPROVIDES:${PN} += "bird-doc bird-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
