SUMMARY = "Qt 6 Bodymovin library"
DESCRIPTION = "The Qt 6 Bodymovin library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Bodymovin6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "466841d3ebf74977ef45d506861884060179eea594b1c79d3911848636c30aba39488ed82e4bb85bf173e0e97229d13e7f959224302c748048eab83ff569a329"

RPROVIDES:${PN} += "libQt6Bodymovin.so.6()(64bit) \
libQt6Bodymovin.so.6(Qt_6)(64bit) \
libQt6Bodymovin.so.6(Qt_6.0)(64bit) \
libQt6Bodymovin.so.6(Qt_6.1)(64bit) \
libQt6Bodymovin.so.6(Qt_6.2)(64bit) \
libQt6Bodymovin.so.6(Qt_6.3)(64bit) \
libQt6Bodymovin.so.6(Qt_6.4)(64bit) \
libQt6Bodymovin.so.6(Qt_6.5)(64bit) \
libQt6Bodymovin.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Bodymovin6 \
libQt6Bodymovin6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Gui.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
