SUMMARY = "Development files for the GNOME task manager"
DESCRIPTION = "A intuitive and powerful application to manage your personal tasks. \
It uses GNOME technologies and has complete integration with the \
GNOME desktop environment. \
 \
This package contains the development files for endeavour."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "endeavour-devel-43.0-1.1.aarch64.rpm"
RPM_HASH = "e92ea9394053f5861977f443a04d3040340c9724c79e1fb7ddedc76ab358d2abfb0a872f890e39f8498988a8b9f64795abd68bb0554436ccc9ab6253df3079a1"

RPROVIDES:${PN} += "endeavour-devel \
endeavour-devel(aarch-64) \
pkgconfig(endeavour)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
