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

PV = "1.9.9"

RPM_NAME = "pcsc-lite-1.9.9-2.3.aarch64.rpm"
RPM_HASH = "e4340d8d5d7e10c4bf0500499263a6742f47c25ebcc77316ef8bcdfb6160667127015c2ca016412936539c7a8c1b28b876fc70cecd2e3de7de6be3c7dbcc6659"

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
