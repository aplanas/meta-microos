SUMMARY = "A CSS parser and selection engine"
DESCRIPTION = "LibCSS is a CSS (Cascading Style Sheet) parser and selection engine, \
written in C. It was developed as part of the NetSurf project. \
 \
Features: \
* Parses CSS, good and bad \
* Simple C API \
* Low memory usage \
* Fast selection engine \
* Portable"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "libcss0-0.9.1-2.9.aarch64.rpm"
RPM_HASH = "9a5e666969f6b382b615418bcfae554de5dfce2e6871debe16d7623ca2b34d661fd8ef1605fda051d0984e1dfdd24b37a9d2954c11630f466dbaacfa6c81ef8a"

RPROVIDES:${PN} += "libcss.so.0()(64bit) \
libcss0 \
libcss0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libparserutils.so.0()(64bit) \
libwapcaplet.so.0()(64bit)"

inherit rpm
