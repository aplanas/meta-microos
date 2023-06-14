SUMMARY = "Development files for libappmenu-gtk3-parser"
DESCRIPTION = "This package contains development-files for libappmenu-gtk3-parser."
LICENSE = "LGPL-3.0-or-later"

PV = "0.7.6"

RPM_NAME = "libappmenu-gtk3-parser-devel-0.7.6-1.6.aarch64.rpm"
RPM_HASH = "f50b6a195439de58be74c26ff63aedaa94c7d172fae60d479540e5dd68d2a7c27feaef8447d959cbbe1fa4eee1c6651447ef4be0a610aeb412e87f0fd8280d54"

RPROVIDES:${PN} += "libappmenu-gtk3-parser-devel \
pkgconfig-appmenu-gtk3-parser"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libappmenu-gtk-parser-devel \
libappmenu-gtk3-parser0 \
pkgconfig-gtk+-3.0"

inherit rpm
