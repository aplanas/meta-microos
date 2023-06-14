SUMMARY = "Development files for the Enchant spell checking library"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.15"

RPM_NAME = "enchant-devel-2.2.15-3.4.aarch64.rpm"
RPM_HASH = "1e6da87181750f380bdf34c1506cef8391d70837cad43b0e91403ef5d9e689727d94d01cf64a978e820e286e22c8a0f9b9fe222af46641c84f75d00403487aa8"

RPROVIDES:${PN} += "enchant-devel \
pkgconfig-enchant-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libenchant-2-2 \
libstdc++-devel \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0"

inherit rpm
