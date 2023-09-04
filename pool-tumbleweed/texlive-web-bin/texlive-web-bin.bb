SUMMARY = "Binary files of web"
DESCRIPTION = "Binary files of web"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-web-bin-2023.20230311.svn65877-93.2.aarch64.rpm"
RPM_HASH = "d01ed2744d10d68c40bf38e4c0addfe98a9f1e51fc8a5184ace1615c8d4a130134cd5c4b53eea6e3271a2855681c0f128af4a5b6c5dfdb1af756751aca098136"

RPROVIDES:${PN} += "texlive-web-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-web"

inherit rpm
