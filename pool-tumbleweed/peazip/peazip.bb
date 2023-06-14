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

RPM_NAME = "peazip-9.2.0-1.1.aarch64.rpm"
RPM_HASH = "73cee8716a2338bc03289b6e01495714322541fbd059430864d5921d49ea9240c4ba269551c83748b5336aabfcf4e624a73859e8f530af9a54ca90aeb8ff23dd"

RPROVIDES:${PN} += "peazip"

RDEPENDS:${PN} += "/bin/sh \
libQt5Pas.so.1 \
libX11.so.6 \
libc.so.6 \
p7zip-full \
upx"

inherit rpm
