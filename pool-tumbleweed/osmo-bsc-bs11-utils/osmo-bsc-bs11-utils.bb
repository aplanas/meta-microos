SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-bs11-utils-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "fe6d24a3d44d9b8e0ddcfd95b089c98930455fd10db1deb670255cd237ba7cc1dca77c54d4054a601d1be88ff9d266ca47ab8cca2149abd23b784599091c1f58"

RPROVIDES:${PN} += "osmo-bsc-bs11-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-mgcp-client.so.9 \
libosmo-sigtran.so.7 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmonetif.so.11 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
