SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.1"

RPM_NAME = "enchant-1-devel-1.6.1-6.3.aarch64.rpm"
RPM_HASH = "2c613728a2ba9a4d270e62e4d52a35d8f96dcae60f5aeb90e64572d65dfded3c32f7ecbc7c553139ff3946afe8c9025d30189648dcae0aa6453b2fa9ebb920e4"

RPROVIDES:${PN} += "enchant-1-devel \
enchant-1-devel(aarch-64) \
pkgconfig(enchant)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libenchant1 \
libstdc++-devel \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-no-export-2.0)"

inherit rpm
