SUMMARY = "Documentation for the FUSE library version 3"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.16.1"

RPM_NAME = "fuse3-doc-3.16.1-1.1.aarch64.rpm"
RPM_HASH = "f2a4252f3abf8b0f81290d35835a624ac7e4c26ee38e58782c2efe0e3bd47d5679752db2ad4004ed7f07a1ea299401b88ce80f6ee9435d2b4586c8f393b7aed7"

RPROVIDES:${PN} += "fuse3-doc"

RDEPENDS:${PN} += ""

inherit rpm
