SUMMARY = "Osmocom GSM A-bis interface library"
DESCRIPTION = "In the GSM system architecture, A-bis is a Base Station \
System-internal interface linking the Base Transceiver Stations (BTS) \
and Base Station Controller (BSC). This interface allows control of \
the radio equipment and radio frequency allocation in the BTS. \
 \
This library contains common/shared code regarding this A-bis \
interface. It also implements drivers for mISDN and DAHDI-based E1 \
cards, as well as some A-bis/IP dialects."
LICENSE = "AGPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "libosmoabis10-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "f4a9d662fdad7cb2cc7523cc2f2f0a2600ebc1a7b5d28f9a4701670b9c4bdc362c02a7f27e801c7ee9901bafd70e43a43122bd1aa079921b76cb6ea602d25cfd"

RPROVIDES:${PN} += "libosmoabis.so.10 \
libosmoabis10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-e1d.so.1 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmoisdn.so.0 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
