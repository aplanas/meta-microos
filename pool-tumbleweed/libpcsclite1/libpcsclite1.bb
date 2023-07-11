SUMMARY = "PC/SC Smart Card Library"
DESCRIPTION = "PC/SC Lite provides a Windows SCard interface in a small form factor \
for communication with smart cards and readers. \
 \
Security aware people should read the SECURITY file for possible \
vulnerabilities of pcsclite and how to fix them. For information on how \
to install drivers please read the DRIVERS file. \
 \
Memory cards will be supported through the MCT specification, which is \
an APDU like manner sent normally through the SCardTransmit() function. \
This functionality is exercised in the driver."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "libpcsclite1-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "f8d828813376bbcda989bd38992ef9baf5eb0b599db88536502c177eaf39a27a5cdb651ee25a780a5547281e823a8d304965d05e3bfa06aa1cb362e4576ca7b6"

RPROVIDES:${PN} += "libpcsclite.so.1 \
libpcsclite1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
