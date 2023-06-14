SUMMARY = "Utility to edit and display the ICE authorization information"
DESCRIPTION = "The iceauth program is used to edit and display the authorization \
information used in connecting with ICE. It operates very much \
like the xauth program for X11 connection authentication records."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "iceauth-1.0.9-1.6.aarch64.rpm"
RPM_HASH = "6cb7d3ca040e50bc060a5269d25295fd58cd2a22a432cfb1f34d8ee83a831007722df635fbbc57c2025cdcd9fd8ad192d47035df1e96b3e9aac06323d42ddff6"

RPROVIDES:${PN} += "iceauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libc.so.6"

inherit rpm
