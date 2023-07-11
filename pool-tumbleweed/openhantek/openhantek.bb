SUMMARY = "Software for Hantek DSO6022 USB digital signal oscilloscopes"
DESCRIPTION = "OpenHantek6022 is a free software for Hantek DSO6022 USB digital signal \
oscilloscopes that is actively developed on \
github.com/OpenHantek/OpenHantek6022 - but only for Hantek 6022BE/BL and \
compatible scopes (Voltcraft, Darkwire, Protek, Acetech, etc.)."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.2.2"

RPM_NAME = "openhantek-3.3.2.2-1.2.aarch64.rpm"
RPM_HASH = "ae2dd3cd75cfab72d92c431884d6b255dfa75cd7984ac1cf30f1c39335717c981bd9a716e8738e6e51dc54b0d5592ad6b5dd47c532c21429c353dc37abd6b3f6"

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
