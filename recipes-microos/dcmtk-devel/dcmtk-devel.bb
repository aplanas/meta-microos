SUMMARY = "Development files for dcmtk"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using dcmtk."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "dcmtk-devel-3.6.7-2.2.aarch64.rpm"
RPM_HASH = "e31683fb1c0aeeae72e70176eb7dc46be1df36df24401e80521c05ef9be802029303e65eeea4e94fb97369e737b7b8836a71c61cfe825bf6b4db2bb0be9efe0d"

RPROVIDES:${PN} += "cmake(DCMTK) \
dcmtk-devel \
dcmtk-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdcmtk17 \
tcpd-devel"

inherit rpm
