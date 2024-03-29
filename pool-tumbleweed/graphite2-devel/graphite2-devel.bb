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

RPM_NAME = "graphite2-devel-1.3.14-3.8.aarch64.rpm"
RPM_HASH = "218eb36bcfd44b2cda94a83e3f1783a34369eefdb46151f45ce440d12ce585f7735fc63de6cdc1fc7ffc585addae4f17550fef0789cd18e4b6bd12803979849c"

RPROVIDES:${PN} += "graphite2-devel \
pkgconfig-graphite2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libgraphite2-3"

inherit rpm
