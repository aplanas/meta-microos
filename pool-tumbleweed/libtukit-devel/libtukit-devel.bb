SUMMARY = "Development files for tukit library"
DESCRIPTION = "This package contains the files required to develop programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.2.1"

RPM_NAME = "libtukit-devel-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "daa5fc87a1a4d71367957e60abba4dc0061111ada723a737124baaabe4293632a2e0fee338b78ffce917448fc5376cd1c5d7b1c578d80374d40db010283c71b4"

RPROVIDES:${PN} += "libtukit-devel \
pkgconfig-tukit \
tukit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtukit4 \
pkgconfig-libeconf \
pkgconfig-mount \
pkgconfig-rpm"

inherit rpm
