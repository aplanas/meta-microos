SUMMARY = "The development files for libconfuse"
DESCRIPTION = "libConfuse is a configuration file parser library. It supports \
sections and (lists of) values (strings, integers, floats, booleans \
or other sections), as well as single/double-quoted strings, \
environment variable expansion, functions and nested include \
statements. \
 \
This package holds the development files for libconfuse."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3"

RPM_NAME = "libconfuse-devel-3.3-2.4.aarch64.rpm"
RPM_HASH = "248bdbb334bf761884dee76b9049f561fb1bb2e6031a60f8e773ce5525836525ae7ebd2a2518a86eb04f58c4a3bf393d8e78a10f02387a1bdbb884cdc4113faf"

RPROVIDES:${PN} += "libconfuse-devel \
pkgconfig-libconfuse"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libconfuse2"

inherit rpm
