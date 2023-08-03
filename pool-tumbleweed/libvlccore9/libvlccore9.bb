SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlccore9-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "ecaa604cc7f0871c8e972046ae415989ef36ce869ed3609d0673d62f44bf201672db963810671866eb51a4a9f03c589163bc78d3117dbc70cc061f966d0e555c"

RPROVIDES:${PN} += "libvlccore.so.9 \
libvlccore9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libidn.so.12 \
libm.so.6"

inherit rpm
