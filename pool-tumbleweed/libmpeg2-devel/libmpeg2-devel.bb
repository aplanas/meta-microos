SUMMARY = "Development files for libmpeg2"
DESCRIPTION = "Include Files and Libraries mandatory for libmpeg2 Development"
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "libmpeg2-devel-0.5.1-3.13.aarch64.rpm"
RPM_HASH = "0fbbd2e2108ce1fa2fc9feee89a83e0716df80610d5785b8d5dbdab7b01f705bc4805d00428920da33d10df24a1891a85689b3fc628f9d889036bb46714731f4"

RPROVIDES:${PN} += "libmpeg2-devel \
pkgconfig-libmpeg2 \
pkgconfig-libmpeg2convert"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpeg2-0 \
libmpeg2convert0"

inherit rpm
