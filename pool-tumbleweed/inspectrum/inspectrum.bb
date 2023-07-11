SUMMARY = "A tool for analysing captured signals from SDRs"
DESCRIPTION = "A tool for analysing captured signals, primarily from software-defined radio receivers"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "inspectrum-0.2.3-1.11.aarch64.rpm"
RPM_HASH = "5e242edeab1c1c18bdb1dc80b968290dc2414c1265f0a1827fd170f0a7692ca5d58423098ddeeecef6fd94b102e138e444b36a5c1d381da9de39b3f4ce9927db"

RPROVIDES:${PN} += "inspectrum"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libliquid.so \
libm.so.6 \
libstdc++.so.6 \
update-desktop-files"

inherit rpm
