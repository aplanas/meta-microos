SUMMARY = "Configuration for the SELinux policy management library"
DESCRIPTION = "Configuration file for libsemanage. Moved to a separate package to allow \
parallel installation"
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-conf-3.5-2.1.aarch64.rpm"
RPM_HASH = "60551e26e3bc2b015b07a31e406a7514ddba1b3b058f282ce1c04e1339e71dbc7bdd47c58145ed21f83e6361816f5beea00f2085288152bdb5b33a94cb282219"

RPROVIDES:${PN} += "config-libsemanage-conf \
libsemanage-conf"

RDEPENDS:${PN} += ""

inherit rpm
