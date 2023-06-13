SUMMARY = "MATE Desktop keyboard configuration development files"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "libmatekbd-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "da8e283685238208fb405b1e21b79e7bfd2daf05091b0306a186a23c63795b8f0ca8292bf4ab125b810cbecda3618664b2aa6502c5aad7f824e3f82f48998bc1"

RPROVIDES:${PN} += "libmatekbd-devel \
libmatekbd-devel(aarch-64) \
pkgconfig(libmatekbd) \
pkgconfig(libmatekbdui)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatekbd4 \
matekbd-common \
pkgconfig(gdk-3.0) \
pkgconfig(gio-2.0) \
pkgconfig(gmodule-export-2.0) \
pkgconfig(libxklavier)"

inherit rpm
