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

RPM_NAME = "openbabel-3.1.1-1.4.aarch64.rpm"
RPM_HASH = "c090deb185b4918b29a0618f7f7acda992e90c0e725d113820b0d4450fe8aa999e9db865b81780e1ac9e69dfd7654117bd419bd79b3b4e3e43c5f02f519242ac"

RPROVIDES:${PN} += "openbabel \
openbabel(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libopenbabel.so.7()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
