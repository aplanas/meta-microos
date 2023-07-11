SUMMARY = "SMB module for OpenVAS Scanner"
DESCRIPTION = "This is the smb module for the OpenVAS Scanner. It includes libraries \
(openvas-wmiclient/openvas-wincmd) to interface with Microsoft Windows \
Systems through the Windows Management Instrumentation API and a \
winexe binary to execute processes remotely on that system."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "openvas-smb-1.0.5-2.2.aarch64.rpm"
RPM_HASH = "2f657e7ec9dc7e102699f266ad3069abf3b53a8dc641c86e2be05fb870f5c6283f064288b95f6436b11c92ae3bdf46e7e2f522a6618145ad725f1cf30676e83e"

RPROVIDES:${PN} += "openvas-smb \
winexe \
wmic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libgnutls.so.30 \
libgssapi.so.3 \
libhdb.so.9 \
libkrb5.so.26 \
libpopt.so.0"

inherit rpm
