SUMMARY = "Development files for the valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code. \
 \
This package contains the libvaladoc development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.13"

RPM_NAME = "libvaladoc-0_56-devel-0.56.13-1.1.aarch64.rpm"
RPM_HASH = "d21bd1f574e46c8583a553edf1a9370381cf79ee4504f2f2c1613280c03cb3506cfcade6410077dfc81f0c632dcb038120e56aa76039c0cab9cbe03e821b7175"

RPROVIDES:${PN} += "libvaladoc-0-56-devel \
libvaladoc-devel \
pkgconfig-valadoc-0.56"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvaladoc-0-56-0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libgvc \
pkgconfig-libvala-0.56"

inherit rpm
