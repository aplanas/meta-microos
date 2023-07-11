SUMMARY = "Development files for gtk2-engines"
DESCRIPTION = "This package contains development files for gtk2-engines."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engines-devel-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "f6dffaba7f0a807baa6efbf598a4a00894ee70cc1b152f5a6ee2b52dac92b17675c928cd9ea5d92e4f4e734a4a7cdb2244c413698d50a60c54b32d0950833a66"

RPROVIDES:${PN} += "gtk2-engines-devel \
pkgconfig-gtk-engines-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gtk2-engines \
pkgconfig-gtk+-2.0"

inherit rpm
