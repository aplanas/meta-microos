SUMMARY = "PC/SC IFD Handler for the ECO 5000 Serial Smart Card Reader"
DESCRIPTION = "Driver for the ECO 5000 Serial Smart Card Reader. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package. \
 \
This interface allows access to the terminal using the Card Terminal \
Basic Command Set (CT-BCS). This driver also includes the support for \
memory cards, exposed as Interindustry Command Set for Synchronous \
Cards. \
 \
The CT-API driver supports the IFD Handler interface from PC/SC. \
 \
Please take a look in the included README document for further \
information. \
 \
This driver only works with the serial interface version of the ECO \
5000. ORGA also sells a USB version, that is incompatible with the \
serial version. This driver will not work with the USB version! \
 \
 \
 \
Authors: \
-------- \
    Frank Thater <frank@thater-online.de> \
    Andreas Schwier <andreas.schwier@cardcontact.de>"
LICENSE = "GPL-2.0+"

PV = "1.2.0"

RPM_NAME = "pcsc-eco5000-1.2.0-88.26.aarch64.rpm"
RPM_HASH = "c6ada43e99eb98dc3c7414d4dabdc5284fe88b877614562290d8c9a7d2dfb07392d3efeda73d89536478bf3972db1f4c5d6ffe1b214c09d2b62aac9e762e7072"

RPROVIDES:${PN} += "libcteco5000.so.0 \
pcsc-eco5000"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-lite"

inherit rpm
