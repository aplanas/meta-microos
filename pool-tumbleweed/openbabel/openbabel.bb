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

RPM_NAME = "openbabel-3.1.1-2.1.aarch64.rpm"
RPM_HASH = "3802f765addb00238e2500f3c97d48e6aecc3d7501cede672b7d07f7b388a6de6ae5c2a0d481fc57574e1b5ae306607367a88faf480b48d1dd8533863cd4d63b"

RPROVIDES:${PN} += "openbabel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopenbabel.so.7 \
libstdc++.so.6"

inherit rpm
