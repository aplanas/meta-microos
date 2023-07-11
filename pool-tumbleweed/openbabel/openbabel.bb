SUMMARY = "A chemistry toolbox"
DESCRIPTION = "Open Babel is a chemical toolbox understanding many formats of \
chemical data. It allows to search, convert, analyze, or store data \
from molecular modeling, chemistry, solid-state materials, \
biochemistry, or related areas. \
 \
This package contains the command-line utility, which is intended to \
be used as a replacement for the original babel program, to translate \
between various chemical file formats as well as a wide variety of \
utilities to foster development of other open source scientific \
software."
LICENSE = "GPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "openbabel-3.1.1-1.5.aarch64.rpm"
RPM_HASH = "7ba34d7c3b5d0a86fb750ef3d3ec3f4fdeaf296fff077eec00dd64ebbe024cde021983c91a33a2f2d8df644b75f4b43c123db48f801fda3f6f58c15e6844dc87"

RPROVIDES:${PN} += "openbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenbabel.so.7 \
libstdc++.so.6"

inherit rpm
