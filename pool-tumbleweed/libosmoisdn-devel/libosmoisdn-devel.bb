SUMMARY = "Development files for the Osmo ISDN utility library"
DESCRIPTION = "The libosmocore library contains various utility functions, a \
collection of common code used in various ISDN related sub-projects \
inside the Osmocom family of projects. It includes an I.460 \
sub-channel multiplex and a generic LAPD core."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoisdn-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "0175dced96887f66f1c85f983a75154902ed49e114a344f09938c58248b9cb3a30851362f9b6f18175287ab183239e85b8e33c0ee124dd6e97935f321dc1b051"

RPROVIDES:${PN} += "libosmoisdn-devel \
pkgconfig-libosmoisdn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libosmocore \
pkgconfig-talloc"

inherit rpm
