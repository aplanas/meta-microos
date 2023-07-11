SUMMARY = "OpenPGP implementation fully compliant with RFC 4880"
DESCRIPTION = "RNP is a set of OpenPGP (RFC4880) tools, an alternative to GnuPG."
LICENSE = "Apache-2.0 & BSD-2-Clause & BSD-3-Clause"

PV = "0.17.0"

RPM_NAME = "rnp-0.17.0-4.1.aarch64.rpm"
RPM_HASH = "17b0731e54101d5850840ea4d2e8bd29877f7e2795d1cd7a39e8ce089bec8a76dc7067b1f9c009536726b4e5816471fe21d317df375271d88e52993d16c77f9c"

RPROVIDES:${PN} += "rnp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjson-c.so.5 \
librnp.so.0 \
libstdc++.so.6"

inherit rpm
