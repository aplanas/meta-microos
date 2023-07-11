SUMMARY = "Development files for tukit library"
DESCRIPTION = "This package contains the files required to develop programs to do \
transactional updates using btrfs snapshots."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "libtukit-devel-4.3.0-1.1.aarch64.rpm"
RPM_HASH = "cc3883c3e6cccd47125a64b61ad2fd9f58919baf5e486c29261e639610fe55517289d5c5bb836c63c90f8b71659d20da04402d5c1257773c838ba1d84d88dd31"

RPROVIDES:${PN} += "libtukit-devel \
pkgconfig-tukit \
tukit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtukit4 \
pkgconfig-libeconf \
pkgconfig-mount \
pkgconfig-rpm"

inherit rpm
