SUMMARY = "C++ Logging Library - Documentation"
DESCRIPTION = "RLOG is a C++ library to manage message logging. \
This subpackage contains the developer/API documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "librlog5-doc-1.4-19.4.aarch64.rpm"
RPM_HASH = "4a03f9135ecba1e92e99e04e42545c47314cb290850f5e62192e80ea1758f734ff30bf8447c1e6f05909c57c550d2db8e1f4553748b98612625c83909f2d5af3"

RPROVIDES:${PN} += "librlog5-doc \
librlog5-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
