SUMMARY = "Header files for the liblo OSC implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of liblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.31"

RPM_NAME = "liblo-devel-0.31-1.12.aarch64.rpm"
RPM_HASH = "58854f0f7dd91b78701bd1e7a6495146371aae81cf13d66ab76b0f170295a42174ee470bca29f12f75922bda6dbf1e1ec81cdc7eb801f640589b9b60d2becf7f"

RPROVIDES:${PN} += "liblo-devel \
pkgconfig-liblo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblo.so.7 \
liblo7"

inherit rpm
