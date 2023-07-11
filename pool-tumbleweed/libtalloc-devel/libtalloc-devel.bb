SUMMARY = "Libraries and Header Files to Develop Programs with talloc2 Support"
DESCRIPTION = "Talloc is a hierarchical, reference counted memory pool system with \
destructors. \
 \
It is the core memory allocator used in Samba. \
 \
Libraries and Header Files to Develop Programs with talloc2 Support."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.0"

RPM_NAME = "libtalloc-devel-2.4.0-3.2.aarch64.rpm"
RPM_HASH = "0c686e8829d2b6292e21050d83103b8b06fc40d3fb7ad8d0b7a32416728b1e8e6c02f7b63d8b9e3d5320c6fe2714405b57f57c3c1ee7e84bcc7d87da2feff372"

RPROVIDES:${PN} += "libtalloc-devel \
pkgconfig-talloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtalloc2 \
pkg-config"

inherit rpm
