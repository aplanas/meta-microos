SUMMARY = "Development files for the Osmocom VTY interface library"
DESCRIPTION = "The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmovty."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmovty-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "b283677329e9a047c2426f310eb3c587d759355dd16740f472ba6e06b4b0dc45cef565812ae36af8456e4e6f27f0cc7031b494e5d78a7d427a33ddb08cd15491"

RPROVIDES:${PN} += "libosmovty-devel \
pkgconfig-libosmovty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmovty9 \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
