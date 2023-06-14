SUMMARY = "Development header for GSSAPI NTLMSSP"
DESCRIPTION = "A header file with definitions for custom GSSAPI extensions for NTLMSSP."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "gssntlmssp-devel-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "7bf22f60a7505aaf764700310a96db8d0ec4d286328bf31ee2005bbbbde594e4735259f09a728d2de13e8975d236c882ac2c6724c68944a09ecc2c0f151da616"

RPROVIDES:${PN} += "gssntlmssp-devel"

RDEPENDS:${PN} += "gssntlmssp"

inherit rpm
