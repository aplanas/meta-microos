SUMMARY = "Osmocom control interface library"
DESCRIPTION = "libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoctrl."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoctrl-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "e8f3dd6e57876681df73c01a3367153f50447a29cde437fd0a202a69b6941c5309a6d9c78b2cd5813e506fa56968cd418a697673e53c4bed04cea2d5ebadd6b9"

RPROVIDES:${PN} += "libosmoctrl-devel \
libosmoctrl-devel(aarch-64) \
pkgconfig(libosmoctrl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmoctrl0 \
libosmovty-devel \
pkgconfig(libosmocore) \
pkgconfig(libosmogsm) \
pkgconfig(talloc)"

inherit rpm
