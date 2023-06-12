SUMMARY = "Development files for WindowMaker"
DESCRIPTION = "This package contains the header files and libraries necessary for \
developing applications which use WindowMaker."
LICENSE = "GPL-2.0-or-later"

PV = "0.95.9"

RPM_NAME = "WindowMaker-devel-0.95.9-2.10.aarch64.rpm"
RPM_HASH = "4ecc6fc1ac9b56aae137ceead16b3f63a7e41a1924f56e0b24fd57f222c30660de248b4e2dead996bff393315f1173607bb9e7abad8ebf641a2d4432dc1ec964"

RPROVIDES:${PN} += "WindowMaker-devel \
WindowMaker-devel(aarch-64) \
pkgconfig(WINGs) \
pkgconfig(WUtil) \
pkgconfig(wmlib) \
pkgconfig(wrlib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
WindowMaker \
pkgconfig(WUtil) \
pkgconfig(wrlib) \
pkgconfig(x11)"

inherit rpm
