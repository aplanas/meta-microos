SUMMARY = "Development package for libjcat"
DESCRIPTION = "Files for development with libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.13"

RPM_NAME = "libjcat-devel-0.1.13-1.1.aarch64.rpm"
RPM_HASH = "cc4c738679d02d3700fa0af2905b4443b516279a5dfc2cf4a279c87032c86b09865d19b957ae74caa60aeade76c28f7729eddd693362086f56a547935c1af1d6"

RPROVIDES:${PN} += "libjcat-devel \
libjcat-devel(aarch-64) \
pkgconfig(jcat)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
jcat-tool \
libjcat1 \
pkgconfig(gio-2.0) \
pkgconfig(gnutls) \
pkgconfig(hogweed) \
pkgconfig(json-glib-1.0)"

inherit rpm
