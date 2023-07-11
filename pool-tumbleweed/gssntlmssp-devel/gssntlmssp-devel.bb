SUMMARY = "Development header for GSSAPI NTLMSSP"
DESCRIPTION = "A header file with definitions for custom GSSAPI extensions for NTLMSSP."
LICENSE = "ISC"

PV = "1.2.0"

RPM_NAME = "gssntlmssp-devel-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "7be8c18900c498cc8ea259106156c0a6d6359f0a160caa933323f7f28dee92bfb86c4367a76c5637b3b990007ceec9d77b092d475921db0c0b7da82f9350b1e7"

RPROVIDES:${PN} += "gssntlmssp-devel"

RDEPENDS:${PN} += "gssntlmssp"

inherit rpm
