SUMMARY = "Shared code for the VLC media player program"
DESCRIPTION = "This subpackage contains libraries that are part of VLC."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "libvlccore9-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "351cdb67a6fe2c4fc6637e477a505d1550ed424a23068d49cb366ebe5ae1af6cbf1afc02ae0cad51d3c96d553507fa50e99f9c25b86e4dc582738bdb55a6d1e8"

RPROVIDES:${PN} += "libvlccore.so.9 \
libvlccore9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libidn.so.12 \
libm.so.6"

inherit rpm
