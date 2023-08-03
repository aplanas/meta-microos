SUMMARY = "Qt 6 Bodymovin library"
DESCRIPTION = "The Qt 6 Bodymovin library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Bodymovin6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "de09e0916d58246252ecc625787824a2293b960807e6363a99000104a58db0c07f6769c5b1fa82131340620d171255bdb099d57eacba64a709e68a8bc7483ed8"

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
