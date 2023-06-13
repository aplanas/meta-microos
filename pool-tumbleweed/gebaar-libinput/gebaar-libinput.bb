SUMMARY = "WM Independent Touchpad Gesture Daemon for libinput"
DESCRIPTION = "gebaar-libinput is a window manager independent touchpad gesture \
daemon for libinput. Unlike other gesture daemons, such as \
libinput-gestures and fusuma, which parse the output of libinput \
debug-events, gebaar-libinput interfaces with libinput directly."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.5"

RPM_NAME = "gebaar-libinput-0.0.5-2.10.aarch64.rpm"
RPM_HASH = "241004499056fd31397f38d514b11e2b3527f66aff773ba93da2d649d802ab138ded8afeba2ae47780d9d8c3a133324db92ef30fa79199dbbc57240fe55645fb"

RPROVIDES:${PN} += "gebaar-libinput \
gebaar-libinput(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.20.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
