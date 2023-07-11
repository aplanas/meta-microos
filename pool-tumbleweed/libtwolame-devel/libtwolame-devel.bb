SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "libtwolame-devel-0.4.0-1.15.aarch64.rpm"
RPM_HASH = "b9fb0f36cb05cec2592c1d360b0390a32208ccb3479e6ba86e373b0686ea923c1d6f581364fbb4ea5b0973e7b2286593966df43b65bca6da76bd05f827752460"

RPROVIDES:${PN} += "libtwolame-devel \
pkgconfig-twolame \
twolame-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtwolame0"

inherit rpm
