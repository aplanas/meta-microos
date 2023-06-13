SUMMARY = "Development files for the Osmocom VTY interface library"
DESCRIPTION = "The libosmovty library implements the interactive command-line on the \
VTY (Virtual TTY), as well as configuration file parsing. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmovty."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmovty-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "bfec05ed69ff28005126c6c25c36aff9b537a1a3de2d55e574e643b63aa634ba732c4371e28714bde31ba70aee949d3950cfe505c8d96dae24ef2898578d36e9"

RPROVIDES:${PN} += "libosmovty-devel \
libosmovty-devel(aarch-64) \
pkgconfig(libosmovty)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore-devel \
libosmovty9 \
pkgconfig(libosmocore) \
pkgconfig(talloc)"

inherit rpm
