SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-bs11-utils-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "fbb4694831284798972b7af1babd1a7a9fafd51e7c78453c4ffbe6d9f4327e252255aca255ef937a676f6d14cf982110ae4165bcb442da1b2df5d83e14bfc9f9"

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
