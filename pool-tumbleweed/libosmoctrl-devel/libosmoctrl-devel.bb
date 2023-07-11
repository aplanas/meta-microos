SUMMARY = "Osmocom control interface library"
DESCRIPTION = "libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmoctrl."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmoctrl-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "65f86ea6352b7a2f05984784fb974c64797b8ed7f962face79653909d212ad27962b8a6c85eaef4e76c798d3d1c4cb9448d1219730dd289c48d232c49bbb65b3"

RPROVIDES:${PN} += "libosmoctrl-devel \
pkgconfig-libosmoctrl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmoctrl0 \
libosmovty-devel \
pkgconfig-libosmocore \
pkgconfig-libosmogsm \
pkgconfig-talloc"

inherit rpm
