SUMMARY = "Source Code Control System"
DESCRIPTION = "Source Code Control System (SCCS) is a version control system for \
tracking changes in source code and other text files during the \
development of a piece of software. This allows the user to retrieve \
any of the previous versions of the original source code and the \
changes which are stored."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "sccs-2022.10.16-47.4.aarch64.rpm"
RPM_HASH = "5d137a029a85e42c386f07183f7a3fdfc8bc60eee185796af9bedc5944676c96997992b2175c4a11d197b92d1649948c1f69e71f18db53c38383591435dd1450"

RPROVIDES:${PN} += "sccs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
