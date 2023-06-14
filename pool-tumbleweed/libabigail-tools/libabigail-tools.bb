SUMMARY = "Utilities to inspect ABI-relevant artifacts"
DESCRIPTION = "ABIGAIL constructs, manipulates, (de-)serializes ABI-relevant \
artifacts, such as types, variable, fonctions and declarations \
(collectively, the ABI corpus) of a given library or program. \
 \
This subpackage contains the ABIGAIL utilities allowing to infer \
interesting conclusions about these differences."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "libabigail-tools-2.0-1.7.aarch64.rpm"
RPM_HASH = "4f2d6abd112719c345512cb19213078ff80c442bc0ada8ff5a16c488f59c11253c5ffcb8efdc785fa8b4886419b72f6bdb68d2a23a1dc96398137c423a0e6883"

RPROVIDES:${PN} += "libabigail-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libabigail.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
