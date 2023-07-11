SUMMARY = "C++ Logging Library - Documentation"
DESCRIPTION = "RLOG is a C++ library to manage message logging. \
This subpackage contains the developer/API documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "librlog5-doc-1.4-19.5.aarch64.rpm"
RPM_HASH = "b057c5ff50f49a3aa1deaffc551015f120e66ec2d7c0042b20efea4ddfcfa06784ca60a75d9dddbde30eff1419fe3ba0b1ec073fe14c36dd36507e5fa649738f"

RPROVIDES:${PN} += "librlog5-doc"

RDEPENDS:${PN} += ""

inherit rpm
