SUMMARY = "Bobcat static library"
DESCRIPTION = "Bobcat static library"
LICENSE = "GPL-3.0-only"

PV = "6.02.02"

RPM_NAME = "libbobcat-devel-static-6.02.02-2.4.aarch64.rpm"
RPM_HASH = "6386d3ab8da7b5063102b82bee7f03d5c4d5a5d1640553906e58e48ec074fb6405042e42556aac6bbaecf3be8cde8cc9b21797d5d5032eb2aac846d73f28789d"

RPROVIDES:${PN} += "libbobcat-devel-static"

RDEPENDS:${PN} += "libbobcat-devel"

inherit rpm
