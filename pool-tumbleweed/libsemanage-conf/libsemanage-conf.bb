SUMMARY = "Configuration for the SELinux policy management library"
DESCRIPTION = "Configuration file for libsemanage. Moved to a separate package to allow \
parallel installation"
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-conf-3.5-1.9.aarch64.rpm"
RPM_HASH = "734d1ab0f69b9861a9da0b9324a6374199993f57403b182c3319ba3944783912946795517e3e5ca37802ee5c9c0d80c84b49c2c537659a8ce7c22b88482989b2"

RPROVIDES:${PN} += "config-libsemanage-conf \
libsemanage-conf"

RDEPENDS:${PN} += ""

inherit rpm
