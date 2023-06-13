SUMMARY = "pkgconf shim to provide /usr/bin/pkg-config"
DESCRIPTION = "This package provides the shim links for pkgconf to be automatically \
used in place of pkgconfig. This ensures that pkgconf is used as \
the system provider of pkg-config."
LICENSE = "ISC"

PV = "1.8.0"

RPM_NAME = "pkgconf-pkg-config-1.8.0-2.3.aarch64.rpm"
RPM_HASH = "447f7e798573c2c5cba575d8fb864ce72ad73c4ce1e86579ae067067b2fd42d9a030bce3acd046568f4e088244e76ba7536984cfa1ac7b3fc2c7c3d23e559367"

RPROVIDES:${PN} += "pkg-config \
pkg-config(aarch-64) \
pkgconf-pkg-config \
pkgconf-pkg-config(aarch-64) \
pkgconfig \
pkgconfig(aarch-64) \
pkgconfig(pkg-config)"

RDEPENDS:${PN} += "/bin/sh \
pkgconf(aarch-64) \
pkgconf-m4"

inherit rpm
