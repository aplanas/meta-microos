SUMMARY = "Development files for the valadoc runtime"
DESCRIPTION = "Valadoc is a documentation generator for generating API documentation \
from Vala source code. \
 \
This package contains the libvaladoc development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.12"

RPM_NAME = "libvaladoc-0_56-devel-0.56.12-1.1.aarch64.rpm"
RPM_HASH = "c7895c9f4042c49beb09ec6a806f0f095e087610e36c5254ea1faf696a6b981b70c05876a4a58c571d6073b81cf04d8c9a7f8535d63bb16db5ed849c728360bf"

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
