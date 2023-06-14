SUMMARY = "Development files for libmodulemd"
DESCRIPTION = "This package provides files for developing applications to use libmodulemd."
LICENSE = "MIT"

PV = "2.14.0"

RPM_NAME = "libmodulemd-devel-2.14.0-1.3.aarch64.rpm"
RPM_HASH = "f7ccbbf34a30dc46fd40376c28140207cef7ca5d69ecefd95dfde462500dd1de4efbce4e70fc5307616b89ac6b0d599f9c0f7393d5867a82a3a2a05bb8cbe6bd"

RPROVIDES:${PN} += "libmodulemd-devel \
pkgconfig-modulemd-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodulemd2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-rpm \
pkgconfig-yaml-0.1 \
typelib-1-0-Modulemd-2-0"

inherit rpm
