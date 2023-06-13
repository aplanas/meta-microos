SUMMARY = "Control tool for Envy24 (ice1712) based soundcards"
DESCRIPTION = "envy24control is a GUI control tool for Envy24 (ice1712) based sound cards."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "envy24control-0.6.0-24.3.aarch64.rpm"
RPM_HASH = "b5022da3e9adf7f84e006fa60b418350096c5db0b771022e28582c6d802821d5fd137c91883e4dabe89a0e71dca23454eefd9ea8530a857c949d77ec3c5d4768"

RPROVIDES:${PN} += "alsa-tools-gui:/usr/bin/envy24control \
application() \
application(envy24control.desktop) \
envy24control \
envy24control(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
