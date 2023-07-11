SUMMARY = "Implementation of the Precision Time protocol (IEEE 1588)"
DESCRIPTION = "The PTP daemon (PTPd) implements the Precision Time protocol (PTP) as \
defined by the IEEE 1588 standard. PTP was developed to provide very \
precise time coordination of LAN connected computers. \
 \
PTPd is a complete implementation of the IEEE 1588 specification for a \
standard (non-boundary) clock. PTPd has been tested with and is known \
to work properly with other IEEE 1588 implementations."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "ptpd-2.3.1-9.13.aarch64.rpm"
RPM_HASH = "e89abae79987741ccd6c150cb0b4cd56a04690f943e6248c4e5d84237582f7e26b95212b783ccfeb153fdc18a2c1c4d85d954ebd67921932eb47f9bfd0ca36fe"

RPROVIDES:${PN} += "config-ptpd \
ptpd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnetsnmpmibs.so.40 \
libpcap.so.1 \
systemd"

inherit rpm
