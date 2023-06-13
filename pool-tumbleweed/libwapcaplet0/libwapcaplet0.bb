SUMMARY = "A string internment library"
DESCRIPTION = "LibWapcaplet is a string internment library, written in C. It provides \
reference counted string interment and rapid string comparison \
functionality. It was developed as part of the NetSurf project and is \
available for use by other software under the MIT licence. For further \
details, see the readme."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "libwapcaplet0-0.4.3-2.8.aarch64.rpm"
RPM_HASH = "639e10433bf391c7eebd8a5c43688655f28f051d3dac95994654cce1bb9f6770c6cab822f6dbb518846b33b40277b2c115a1bae521470b7b964f293928ef1a6d"

RPROVIDES:${PN} += "libwapcaplet.so.0()(64bit) \
libwapcaplet0 \
libwapcaplet0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
