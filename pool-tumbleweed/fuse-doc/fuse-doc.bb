SUMMARY = "Document package for FUSE (userspace filesystem)"
DESCRIPTION = "This package contains the documentation for FUSE (userspace filesystem)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.9.9"

RPM_NAME = "fuse-doc-2.9.9-6.4.aarch64.rpm"
RPM_HASH = "7e6a41905607f25e94359b8ffe22bc97605c0b1a4276644b6414118f50b427e05a78a60823fb1f7c54a04f7abfd5caed1dea7350da4b154c187f57f54021538e"

RPROVIDES:${PN} += "fuse-doc"

RDEPENDS:${PN} += ""

inherit rpm
