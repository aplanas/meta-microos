SUMMARY = "Documentation for the FUSE library version 3"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "BSD-2-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "3.14.1"

RPM_NAME = "fuse3-doc-3.14.1-2.1.aarch64.rpm"
RPM_HASH = "9da434c4e80fc0f958eb7a2ff19313f2f127945dea8361db7cc4487423b3096aac13d396eae830cbc6a8c992367b7d001270a2b83953ce5271cc2685417673be"

RPROVIDES:${PN} += "fuse3-doc \
fuse3-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
