SUMMARY = "Development files for dcmtk"
DESCRIPTION = "This package provides development libraries and headers needed to build \
software using dcmtk."
LICENSE = "BSD-3-Clause & Apache-2.0"

PV = "3.6.7"

RPM_NAME = "dcmtk-devel-3.6.7-2.3.aarch64.rpm"
RPM_HASH = "29aeba10a3740a6bc86d379b074bd8a5aee92be38cd5d847ff1a069ba5f0b6f2bb9ce0d673c9f3ba5414276b5fc51a6394f9887dcc637c991f50bd5e1cb752a0"

RPROVIDES:${PN} += "cmake-DCMTK \
dcmtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdcmtk17 \
tcpd-devel"

inherit rpm
