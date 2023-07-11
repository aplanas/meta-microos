SUMMARY = "pkgconf shim to provide /usr/bin/pkg-config"
DESCRIPTION = "This package provides the shim links for pkgconf to be automatically \
used in place of pkgconfig. This ensures that pkgconf is used as \
the system provider of pkg-config."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "pkgconf-pkg-config-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "e7b4f5ba4ebc4774d42fa366d13875ef00de63f499f3238ea869e3c4121aecc9d6bd06c5b6612401a0c095a90e24de6c7691ea68749620a5f5a63496c847d146"

RPROVIDES:${PN} += "pkg-config \
pkgconf-pkg-config \
pkgconfig \
pkgconfig-pkg-config"

RDEPENDS:${PN} += "/usr/bin/sh \
pkgconf \
pkgconf-m4"

inherit rpm
