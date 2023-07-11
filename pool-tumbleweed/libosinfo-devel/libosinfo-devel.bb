SUMMARY = "Header files for libosinfo, an OS/hypervisor information library"
DESCRIPTION = "libosinfo is a library that allows virtualization provisioning tools to \
determine the optimal device settings for a hypervisor/operating system \
combination. \
 \
This package provides includes to compile with the libosinfo library, \
as well as Vala bindings for the libosinfo library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.0"

RPM_NAME = "libosinfo-devel-1.10.0-3.4.aarch64.rpm"
RPM_HASH = "cb43ccfde6e7458ddf3aaa719d5b3951d2cc4bb309b6cdb4269ce363e8a334f97ce5ba09cfbd469f41791ae0efbab497b5c42e22a75693d7d13ec3295f0bab77"

RPROVIDES:${PN} += "libosinfo-devel \
pkgconfig-libosinfo-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosinfo-1-0-0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Libosinfo-1-0"

inherit rpm
