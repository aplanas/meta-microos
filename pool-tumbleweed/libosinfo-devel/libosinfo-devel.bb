SUMMARY = "Header files for libosinfo, an OS/hypervisor information library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination. \
 \
This package provides includes to compile with the libosinfo library, \
as well as Vala bindings for the libosinfo library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-devel-1.10.0-3.3.aarch64.rpm"
RPM_HASH = "89828c99d6162672cc6fb076ab0cc42b23dd5600cda230d7a0effadc6a3fb1fc2a97d5efa3b6bbe641c56ff66aac90557e34eddb902f9a21368a71e8b9912703"

RPROVIDES:${PN} += "libosinfo-devel \
pkgconfig-libosinfo-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosinfo-1-0-0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Libosinfo-1-0"

inherit rpm
