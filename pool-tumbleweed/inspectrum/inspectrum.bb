SUMMARY = "A tool for analysing captured signals from SDRs"
DESCRIPTION = "A tool for analysing captured signals, primarily from software-defined radio receivers"
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "inspectrum-0.2.3-1.10.aarch64.rpm"
RPM_HASH = "f33c38134344b6e92a29ebbb523384c9de9affdbacc56e851961b6b71ee7be68753ba04a577004c67e89973bd9eca5a21c5faec4de61efe7c0a94fe6e4f15d15"

RPROVIDES:${PN} += "application() \
application(inspectrum.desktop) \
inspectrum \
inspectrum(aarch-64)"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libliquid.so()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
update-desktop-files"

inherit rpm
