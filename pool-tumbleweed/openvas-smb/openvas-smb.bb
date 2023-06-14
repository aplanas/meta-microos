SUMMARY = "SMB module for OpenVAS Scanner"
DESCRIPTION = "This is the smb module for the OpenVAS Scanner. It includes libraries \
(openvas-wmiclient/openvas-wincmd) to interface with Microsoft Windows \
Systems through the Windows Management Instrumentation API and a \
winexe binary to execute processes remotely on that system."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "openvas-smb-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "a2d408e24418e57097c93ecd3d986c06e828e7483755b32d8b142b3173f9c138f276700726275d8ce13214572c22ba6d3a14e47f378323120f72badc83e9e48c"

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
