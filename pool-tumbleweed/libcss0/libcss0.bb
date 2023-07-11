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

RPM_NAME = "libcss0-0.9.1-2.10.aarch64.rpm"
RPM_HASH = "b63c308685044b1eec6ff1fc04b386a4eb1a6b2d9793b6c66d41c4c4f5a722a28ef5b150c63a1bcc9af69e3d37092120be5f50768f65197c55ff92ad31b0a724"

RPROVIDES:${PN} += "libcss.so.0 \
libcss0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libparserutils.so.0 \
libwapcaplet.so.0"

inherit rpm
