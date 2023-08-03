SUMMARY = "Documentation for qt6-webchannel in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webchannel in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-webchannel-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "10533d9055723f1ca89a45444a8c2caaaf3d71fec1009bdc9c875fdc022d2e2dee7e5d9a3aad10e5268b7baf6a1b8ceaf34320e9ad4d7b9e2d71a14e24205ed2"

RPROVIDES:${PN} += "qt6-webchannel-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
