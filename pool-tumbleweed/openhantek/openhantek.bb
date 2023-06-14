SUMMARY = "Software for Hantek DSO6022 USB digital signal oscilloscopes"
DESCRIPTION = "OpenHantek6022 is a free software for Hantek DSO6022 USB digital signal \
oscilloscopes that is actively developed on \
github.com/OpenHantek/OpenHantek6022 - but only for Hantek 6022BE/BL and \
compatible scopes (Voltcraft, Darkwire, Protek, Acetech, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.2.2"

RPM_NAME = "openhantek-3.3.2.2-1.1.aarch64.rpm"
RPM_HASH = "579b6f3272968d02ddecaa05fb0dc269b05645aa706a360230b4555aef76f0dece0992fd1a74c88aaa12785f6ebf3e91ee602a38f1a5065b51e32feb261ead80"

RPROVIDES:${PN} += "openhantek"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
