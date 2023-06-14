SUMMARY = "Sample implementation of a Remote Start client"
DESCRIPTION = "This package includes both the client and server sides implementing \
the protocol described in the 'A Flexible Remote Execution Protocol \
Based on rsh' paper found in the specs/ subdirectory. \
 \
This software has been deprecated in favor of the X11 forwarding \
provided in common ssh implementations."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "rstart-1.0.6-1.6.aarch64.rpm"
RPM_HASH = "4a5295b496dc452fa77d5dccc6d995d53618828efd883f35a9cde4442ccc9fa33e6bc8c9719b95cd5d2f6a8269e3cf88d48853374e0b5d05e3f8d1e47e979ac9"

RPROVIDES:${PN} += "rstart"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
