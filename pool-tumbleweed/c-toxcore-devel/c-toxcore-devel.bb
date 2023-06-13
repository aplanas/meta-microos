SUMMARY = "Development files for c-toxcore"
DESCRIPTION = "Development libraries and headers needed to build software using c-toxcore."
LICENSE = "GPL-3.0-only"

PV = "0.2.18"

RPM_NAME = "c-toxcore-devel-0.2.18-1.4.aarch64.rpm"
RPM_HASH = "e6da2b375bed03c9f194e6b98d98cc10a6d1670a43557906c6b494cab0b8f4da3d04842f11c92cf1661c519e76e9c3023bfc8fe5b70d95df17caa09c24829c4b"

RPROVIDES:${PN} += "c-toxcore-devel \
c-toxcore-devel(aarch-64) \
pkgconfig(toxcore)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c-toxcore \
libtoxcore2 \
pkgconfig(libsodium) \
pkgconfig(opus) \
pkgconfig(vpx)"

inherit rpm
