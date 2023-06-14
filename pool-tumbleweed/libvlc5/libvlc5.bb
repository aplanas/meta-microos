SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlc5-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "4633a7c771110a73908d6954d69e40a86109c2db5804fb73e2aba9fca216366445f624f6e9c9cb0c70e64781a8da4ce345a19b52761250025f305d4dc76d9f6a"

RPROVIDES:${PN} += "libvlc.so.5 \
libvlc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libvlccore.so.9"

inherit rpm
