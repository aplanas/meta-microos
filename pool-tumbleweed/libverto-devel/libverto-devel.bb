SUMMARY = "Development files for libverto"
DESCRIPTION = "The libverto-devel package contains libraries and header files \
for developing applications that use libverto."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-devel-0.3.2-3.1.aarch64.rpm"
RPM_HASH = "542ca3e9306ce50e9c088b2fd32b8b7abb34a43d24321c4873a431384961c4d0f138575792347aca68f307965e645c0b3402b9464db9d5f1dab128218da5fba6"

RPROVIDES:${PN} += "libverto-devel \
pkgconfig-libverto"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libverto1"

inherit rpm
