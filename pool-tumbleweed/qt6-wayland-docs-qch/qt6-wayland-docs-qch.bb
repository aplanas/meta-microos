SUMMARY = "Documentation for qt6-wayland in QCH format"
DESCRIPTION = "This package contains documentation for qt6-wayland in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-wayland-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e61d00fce012e069c8203a5b3897db742df6676e2293113a4e9591265a10d77d5d1ba3711bf00d81e3b7ba47fab1a0e60a550cb5dcf4011c379c39b55e32deac"

RPROVIDES:${PN} += "qt6-wayland-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
