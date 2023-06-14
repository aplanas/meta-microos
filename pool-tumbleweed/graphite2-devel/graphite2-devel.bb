SUMMARY = "Files for Developing with graphite2"
DESCRIPTION = "Graphite2 is a project within SIL's Non-Roman Script Initiative and Language \
Software Development groups to provide rendering capabilities for complex \
non-Roman writing systems. Graphite can be used to create 'smart fonts' capable \
of displaying writing systems with various complex behaviors. With respect to \
the Text Encoding Model, Graphite handles the 'Rendering' aspect of writing \
system implementation. \
 \
This package contains the graphite2 development files."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "1.3.14"

RPM_NAME = "graphite2-devel-1.3.14-3.7.aarch64.rpm"
RPM_HASH = "cd3dae229dc002687d69971782fd66f84f4d59088af2dd2a0d010cc843fa6b601389b0dfaf7c079d4086ad15685a173e54606f32ac73cfb4f9dd76b46d832147"

RPROVIDES:${PN} += "graphite2-devel \
pkgconfig-graphite2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgraphite2-3"

inherit rpm
