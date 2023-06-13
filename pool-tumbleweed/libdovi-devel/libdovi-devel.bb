SUMMARY = "Development libraries for libdovi"
DESCRIPTION = "The libdovi-devel package contains C header files for \
developing applications that use libdovi."
LICENSE = "MIT"

PV = "3.1.2"

RPM_NAME = "libdovi-devel-3.1.2-2.1.aarch64.rpm"
RPM_HASH = "27f769cd36707c75bda4a65ba07383cdfbfb4f8255da5120b837f168c52dd19324008c4f110206ebbffe24122831119b894630ac44fb76a5cb4dbd60b0466901"

RPROVIDES:${PN} += "libdovi-devel \
libdovi-devel(aarch-64) \
pkgconfig(dovi)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdovi3"

inherit rpm
