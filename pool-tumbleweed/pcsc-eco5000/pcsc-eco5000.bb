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

RPM_NAME = "pcsc-eco5000-1.2.0-88.25.aarch64.rpm"
RPM_HASH = "0b5bd69171a6a7c6e94c13e2edca73dde62d8f2e919325c4c9abe4817883dc79f3f927f228663798c3441047a420612f847d4ca06540f8cdd1364f13bbce2759"

RPROVIDES:${PN} += "libcteco5000.so.0()(64bit) \
pcsc-eco5000 \
pcsc-eco5000(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
pcsc-lite"

inherit rpm
