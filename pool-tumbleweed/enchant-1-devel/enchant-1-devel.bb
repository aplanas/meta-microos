SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-devel-1.6.1-6.4.aarch64.rpm"
RPM_HASH = "81ca012ccc993fd7119ed6c8a2b1c8178fa940557d4ec7a20fe5bd0882d3811ae8529c770b8be089eb52ed0578c84bc7828e85b3df0a0e94dcac12e72b766b05"

RPROVIDES:${PN} += "enchant-1-devel \
pkgconfig-enchant"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libenchant1 \
libstdc++-devel \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0"

inherit rpm
