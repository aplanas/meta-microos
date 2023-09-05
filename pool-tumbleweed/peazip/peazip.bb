SUMMARY = "Graphical file archiver"
DESCRIPTION = "PeaZip is a file and archive manager GUI for many formats. \
 \
Create: 7Z, ARC, BZ2, GZ, *PAQ, PEA, QUAD/BALZ, TAR, UPX, WIM, XZ, ZIP files \
 \
Extract 150+ archive types: ACE, ARJ, CAB, DMG, ISO, LHA, RAR, UDF, ZIPX and more \
 \
It can extract, create and convert multiple archives at once, \
create self-extracting archives, split/join files, supports strong encryption with two-factor authentication, \
has an encrypted password manager, secure deletion, can find duplicate files, calculate hashes, and \
export job definition as a script."
LICENSE = "LGPL-3.0-only"

PV = "9.4.0"

RPM_NAME = "peazip-9.4.0-1.1.aarch64.rpm"
RPM_HASH = "161f2ca99437bf952af11c27ae1d973bda5dc69cca4c71f05a1fee814bf9f99d3f81ec104e8339d828f057f3ce2c3269ed20154c5c042701438b2f9e75206629"

RPROVIDES:${PN} += "peazip"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6 \
p7zip-full \
upx"

inherit rpm
