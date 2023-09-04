SUMMARY = "Base configuration for gender programs and libraries"
DESCRIPTION = "Base configuration files needed by the gender and libgender packages"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "genders-base-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "573a2f65574d76c672b59552afb47ecf3b63e3d30ea684943c9539b9b52c2554ba1703deb1e04456aa00f13fb0d907fb2bc8a3d6e69c9c0191f3b3f05699eb7d"

RPROVIDES:${PN} += "config-genders-base \
genders-base"

RDEPENDS:${PN} += ""

inherit rpm
