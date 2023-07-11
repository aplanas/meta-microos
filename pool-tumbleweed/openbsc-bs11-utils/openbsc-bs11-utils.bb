SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-bs11-utils-1.4.1-1.11.aarch64.rpm"
RPM_HASH = "cb656d947c44f21f69ee27e7ca5aff25778dbb95d9c4d1d5cf978d68b7f9a825b0a5919fb0885116a6b0426a5dbbc2d461a83b1e676a7cf8fd79a13f80a26916"

RPROVIDES:${PN} += "openbsc-bs11-utils"

RDEPENDS:${PN} += "libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmogsm.so.18 \
libtalloc.so.2"

inherit rpm
