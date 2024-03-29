SUMMARY = "Osmocom's MSC for 2G and 3G circuit-switched mobile networks"
DESCRIPTION = "The Mobile Switching Center (MSC) is the heart of 2G/3G \
circuit-switched services.  It terminates the A-interface links from the \
Base Station Controllers (BSC) and handles the MM and CC sub-layers of \
the Layer 3 protocol from the phones (MS). \
 \
This Osmocom implementation of the MSC handles A interfaces via 3GPP \
AoIP in an ASP role.  It furthermore implements IETF MGCP against an \
external media gateway, such as OsmoMGW.  It does *not* implement MAP \
towards a HLR, but the much simpler Osmocom GSUP protocol, which can \
be translated to MAP if needed."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "osmo-msc-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "e4b2b758e99974235c6b4f210e1a0f2dea59583b6fe72baa82f8292bf051c0ffb328ef4b23a5638518578c043492f095808291eb664c1dd5784cc431cfa014a1"

RPROVIDES:${PN} += "config-osmo-msc \
osmo-msc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libdbi.so.3 \
libosmo-gsup-client.so.0 \
libosmo-mgcp-client.so.9 \
libosmo-ranap.so.7 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmonetif.so.11 \
libosmovty.so.9 \
libsctp.so.1 \
libtalloc.so.2 \
systemd"

inherit rpm
