SUMMARY = "SDR transceiver that implements Layer 1 of a GSM BTS"
DESCRIPTION = "OsmoTRX is a software-defined radio transceiver that implements the Layer 1 \
physical layer of a BTS comprising the following 3GPP specifications: \
 \
TS 05.01 'Physical layer on the radio path' \
TS 05.02 'Multiplexing and Multiple Access on the Radio Path' \
TS 05.04 'Modulation' \
TS 05.10 'Radio subsystem synchronization' \
 \
In this context, BTS is 'Base transceiver station'. It's the stations that \
connect mobile phones to the mobile network. \
 \
3GPP is the '3rd Generation Partnership Project' which is the collaboration \
between different telecommunication associations for developing new \
generations of mobile phone networks. (post-2G/GSM)"
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-trx-1.4.0-1.15.aarch64.rpm"
RPM_HASH = "a982b1bb3a833516296c28c69951eee6ce829201a21988767e83c8b201e287f4cfd16d5901b768d7bcf8a78f9296cc86bc2ce9b9e6930a1dfed1cb97db7f4c2a"

RPROVIDES:${PN} += "osmo-trx"

RDEPENDS:${PN} += "systemd"

inherit rpm
