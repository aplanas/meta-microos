SUMMARY = "C++ Binding for the ATK library"
DESCRIPTION = "atkmm is the C++ binding for the ATK library. \
This module is part of the GNOME C++ bindings effort."
LICENSE = "LGPL-2.1-or-later"

PV = "2.28.3"

RPM_NAME = "atkmm1_6-devel-2.28.3-1.3.aarch64.rpm"
RPM_HASH = "12b6a3f03aa9523a7d68248c24a0e2a2c1428fca8b99b3bcd1aca9c842fda71544b60a0262b668f4c580eeb52d9680582bddc6d3eb2ad4ca6735d9ae5b4e08bb"

RPROVIDES:${PN} += "atkmm1_6-devel \
atkmm1_6-devel(aarch-64) \
pkgconfig(atkmm-1.6)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libatkmm-1_6-1 \
pkgconfig(atk) \
pkgconfig(glibmm-2.4)"

inherit rpm
