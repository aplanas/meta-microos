SUMMARY = "Development libraries and headers for authselect"
DESCRIPTION = "System header files and development libraries for authselect. Useful if \
you develop a front-end for the authselect library."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "libauthselect-devel-1.4.0+git.0.2c30265-3.3.aarch64.rpm"
RPM_HASH = "c37c864afff6859456f96d18be32600dfb0826ba40a52eda2acfb7cf9acd51666f8aa7a47f0d9c02705f955d559d55d6c01010a449906ccd8f21841db4d8faf1"

RPROVIDES:${PN} += "authselect-devel \
libauthselect-devel \
pkgconfig-authselect"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libauthselect3"

inherit rpm
