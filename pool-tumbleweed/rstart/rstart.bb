SUMMARY = "Sample implementation of a Remote Start client"
DESCRIPTION = "This package includes both the client and server sides implementing \
the protocol described in the 'A Flexible Remote Execution Protocol \
Based on rsh' paper found in the specs/ subdirectory. \
 \
This software has been deprecated in favor of the X11 forwarding \
provided in common ssh implementations."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "rstart-1.0.6-1.7.aarch64.rpm"
RPM_HASH = "fb2a32350629a31da3e3f4f834081e62bb522b515248b4e7992c95b0141b36ecc8e69db14beede7375071d66fabbcb4450f4e682106f5e22cb7e1566e0928968"

RPROVIDES:${PN} += "rstart"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
