SUMMARY = "Utility to print an XKB keyboard description"
DESCRIPTION = "xkbprint generates a printable or encapsulated PostScript description \
of an XKB keyboard description."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xkbprint-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "41107bc2c4b61c0a54362aafb6d9b9b505b7d000bd055551cfb4b4401ee0a393eb7f74269a6ebde2811728cb6ea1b0ce28a994226c9765114caa8ec2d9572a14"

RPROVIDES:${PN} += "xkbprint \
xkbprint(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libxkbfile.so.1()(64bit)"

inherit rpm
