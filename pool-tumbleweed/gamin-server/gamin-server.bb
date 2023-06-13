SUMMARY = "Server for the Library providing the FAM File Alteration Monitor API"
DESCRIPTION = "This package contains the daemon for gamin. \
It is split off into its own subpackage to void file conflicts when both \
gamin and gamin-32bit are installed on a multiarch platform."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "gamin-server-0.1.10-18.1.aarch64.rpm"
RPM_HASH = "0528767063604a09094f2b085e2182feea7ba7fe9c71f9e5102340d849dc9d086fa1ed749c7750c5f4cc354bc6f351b6d0c2145aee5e9757bce3425f05f70809"

RPROVIDES:${PN} += "fam-server \
gamin-server \
gamin-server(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
