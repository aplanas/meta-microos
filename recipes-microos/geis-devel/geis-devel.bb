SUMMARY = "Development files for the GEIS interface implementation"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "geis-devel-2.2.17-4.9.aarch64.rpm"
RPM_HASH = "7de734f7a36d68bc6c90cdc0d9c0aa13fc8b088f92690f27945d84dfa5f7e41a45d29c1b9dd5e7f6b674072aed5cb66221b6a09f26c25d2d12cdb15e99b92574"

RPROVIDES:${PN} += "geis-devel \
geis-devel(aarch-64) \
pkgconfig(libgeis)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeis1"

inherit rpm
