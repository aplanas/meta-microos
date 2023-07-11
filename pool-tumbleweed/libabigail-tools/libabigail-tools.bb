SUMMARY = "Utilities to inspect ABI-relevant artifacts"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. \
 \
This subpackage contains the ABIGAIL utilities allowing to infer \
interesting conclusions about these differences."
LICENSE = "LGPL-3.0-or-later"

PV = "2.3"

RPM_NAME = "libabigail-tools-2.3-1.1.aarch64.rpm"
RPM_HASH = "13abe259afebfe3ecc5b8663a683142a8484419d2a509297425a3114926e47fa1c42e1054cec8398aa55bb1a4f0cea77851d573b2902fbc7d82b00f3a4f18658"

RPROVIDES:${PN} += "libabigail-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabigail.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
