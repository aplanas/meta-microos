SUMMARY = "Development files for libsolv, a package solver"
DESCRIPTION = "Development files for libsolv, a library for solving packages and \
reading repositories."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "libsolv-devel-0.7.24-1.3.aarch64.rpm"
RPM_HASH = "27da1f2f7bdc2644bc6ccef36f42dc6da7cb5e7d5dd94c1275d72ac518d2df7f75ae54375707b22b09f645e3abbcc93a242220cf1bb822833a241b1a84e44fb2"

RPROVIDES:${PN} += "libsolv-devel \
pkgconfig-libsolv \
pkgconfig-libsolvext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
pkgconfig-libsolv \
rpm-devel"

inherit rpm
