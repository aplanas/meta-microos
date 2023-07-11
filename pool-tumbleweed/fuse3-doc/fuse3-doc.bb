SUMMARY = "Documentation for the FUSE library version 3"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.15.0"

RPM_NAME = "fuse3-doc-3.15.0-1.1.aarch64.rpm"
RPM_HASH = "2c735f9e49338a67229531f2d4981bc0d3fd1220b4e89aeab9cebb97c8c2c9398cb8843f392b913ac687fd2ad8623faad8735ca030f0566fb4d3883ff84aa435"

RPROVIDES:${PN} += "fuse3-doc"

RDEPENDS:${PN} += ""

inherit rpm
