SUMMARY = "Development files for libkmod"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases. \
 \
This package contains the development headers for the library found \
in libkmod2."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod-devel-30-7.1.aarch64.rpm"
RPM_HASH = "84a918fbd024dfa2bf68b6562c9dfbf7ef5875c22f878efcc3017add94ba47801b4abb85ecbc8a9564718d242612d4886be6e1632d603dac8e0ed038594cf71d"

RPROVIDES:${PN} += "libkmod-devel \
pkgconfig-libkmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkmod2"

inherit rpm
