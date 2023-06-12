SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-bs11-utils-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "fe6d24a3d44d9b8e0ddcfd95b089c98930455fd10db1deb670255cd237ba7cc1dca77c54d4054a601d1be88ff9d266ca47ab8cca2149abd23b784599091c1f58"

RPROVIDES:${PN} += "osmo-bsc-bs11-utils \
osmo-bsc-bs11-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-mgcp-client.so.9()(64bit) \
libosmo-sigtran.so.7()(64bit) \
libosmoabis.so.10()(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmonetif.so.11()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
