SUMMARY = "PC/SC Smart Cards Library"
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
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "pcsc-lite-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "955e590196d40ab066ee3fe219500be1435a2888a7a1558aac41401f49c76ef920d5f9baaf3456f2fd5851f8c5919605b5c3489ceed106ff0f050daf73dba327"

RPROVIDES:${PN} += "config-pcsc-lite \
group-scard \
pcsc-lite \
user-scard"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpcsclite1 \
libpolkit-gobject-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
systemd \
sysuser-shadow"

inherit rpm
