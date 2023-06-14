SUMMARY = "Application Binary Interface Generic Analysis and Instrumentation Library"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. The \
library provides a way to compare two ABI corpuses, provide detailed \
information about their differences, and help build tools to infer \
interesting conclusions about these differences."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "libabigail0-2.0-1.7.aarch64.rpm"
RPM_HASH = "12d4d7c8e5f19e93ec76b99d2a81094633b6f471c29983a46375520dfb8cc0eaedad7057b784ba08cdb731d5a5d2107399e87498a8140de2522c7c04991d4dea"

RPROVIDES:${PN} += "libabigail.so.0 \
libabigail0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
