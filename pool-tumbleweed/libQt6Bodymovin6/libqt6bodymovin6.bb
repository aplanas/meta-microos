SUMMARY = "Qt 6 Bodymovin library"
DESCRIPTION = "The Qt 6 Bodymovin library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Bodymovin6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "466841d3ebf74977ef45d506861884060179eea594b1c79d3911848636c30aba39488ed82e4bb85bf173e0e97229d13e7f959224302c748048eab83ff569a329"

RPROVIDES:${PN} += "libQt6Bodymovin.so.6 \
libQt6Bodymovin6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
