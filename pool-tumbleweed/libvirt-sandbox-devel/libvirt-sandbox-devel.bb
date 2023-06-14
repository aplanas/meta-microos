SUMMARY = "Libvirt application sandbox framework development files"
DESCRIPTION = "This package provides development header files and libraries for \
the libvirt sandbox"
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libvirt-sandbox-devel-0.8.0-5.3.aarch64.rpm"
RPM_HASH = "4ae0122f88fbaf44d7f872a81b9b520474fc54fcf562b29018562c0ed6eae6deda389b14e43119c7223022e7b6ff24fd8f6629da2b0fdcd8e24896f91909ee57"

RPROVIDES:${PN} += "libvirt-sandbox-devel \
pkgconfig-libvirt-sandbox-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-sandbox-1-0-5"

inherit rpm
