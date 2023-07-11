SUMMARY = "OPL2/3 FM instrument loader"
DESCRIPTION = "sbiload is an OPL2/3 FM instrument loader for ALSA hwdep."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "sbiload-0.4.0-24.4.aarch64.rpm"
RPM_HASH = "bcd5c3596d7cf0e554f55b1f57a94289d6fc62b2da6037c3f45039c543f6175465199721191a43ffca2d820bde781bd6f32a245f8e8835f0b0c727a48a609dfd"

RPROVIDES:${PN} += "alsa-tools-/usr/bin/sbiload \
sbiload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
