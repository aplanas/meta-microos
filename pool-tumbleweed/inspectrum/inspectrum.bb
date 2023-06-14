SUMMARY = "A tool for analysing captured signals from SDRs"
DESCRIPTION = "A tool for analysing captured signals, primarily from software-defined radio receivers"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "inspectrum-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "f33c38134344b6e92a29ebbb523384c9de9affdbacc56e851961b6b71ee7be68753ba04a577004c67e89973bd9eca5a21c5faec4de61efe7c0a94fe6e4f15d15"

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
