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

PV = "9.2.0"

RPM_NAME = "peazip-9.2.0-1.2.aarch64.rpm"
RPM_HASH = "4d0df4411e54d4bb44d3fb865ef99374b7bd216f13092002c65b0bc0a9908b9b02382ad81fcf8f3fd153986ae1be02b6dd0e6cdab239b6b4786609b389683c3c"

RPROVIDES:${PN} += "peazip"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6 \
p7zip-full \
upx"

inherit rpm
