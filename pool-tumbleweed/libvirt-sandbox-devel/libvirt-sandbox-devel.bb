SUMMARY = "Libvirt application sandbox framework development files"
DESCRIPTION = "This package provides development header files and libraries for \
the libvirt sandbox"
LICENSE = "LGPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "libvirt-sandbox-devel-0.8.0-5.4.aarch64.rpm"
RPM_HASH = "bbb38bc834613c8765471021ad98a181b11a073599cd2ed7e6416a4954a8ca34ab81ae1edadffb344e524f886738e24c1f046df337c2f639c6e51841d3b2ef1a"

RPROVIDES:${PN} += "libvirt-sandbox-devel \
pkgconfig-libvirt-sandbox-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvirt-sandbox-1-0-5"

inherit rpm
