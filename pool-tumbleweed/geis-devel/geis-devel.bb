SUMMARY = "Development files for the GEIS interface implementation"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "geis-devel-2.2.17-4.10.aarch64.rpm"
RPM_HASH = "d8c42ec4634857f8c98fd3cfa1f24e650e847844ace0aa8aba0a210c8780929e1ce96257eb9e9c029b8308cf758f80b5caafc74ed38f89e3840075834712e4a4"

RPROVIDES:${PN} += "geis-devel \
pkgconfig-libgeis"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgeis1"

inherit rpm
