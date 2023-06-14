SUMMARY = "OpenPGP implementation fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.16.2"

RPM_NAME = "rnp-0.16.2-1.5.aarch64.rpm"
RPM_HASH = "d2151d21325c45d247cdbcc570c751392d5b334623beed618fa94e98b160ce8d58dff5ce96f3fcb8c78bc81078f5db7bd2dba69a0ff5b4f8a2314a5d59d5e7af"

RPROVIDES:${PN} += "rnp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
librnp.so.0 \
libstdc++.so.6"

inherit rpm
