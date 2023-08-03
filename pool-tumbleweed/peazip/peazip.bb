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

PV = "9.3.0"

RPM_NAME = "peazip-9.3.0-1.1.aarch64.rpm"
RPM_HASH = "a1b20cae3d19ef39b3bf3734f2a4f7aa4e727e8f8ac64e31ba7d2c907a46c1a8890970ac81c42e2a1c183bc9d60fd1b35b24ae30e989a76d4c71a696ab85f7a7"

RPROVIDES:${PN} += "peazip"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6 \
p7zip-full \
upx"

inherit rpm
