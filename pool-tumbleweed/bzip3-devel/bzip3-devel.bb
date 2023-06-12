SUMMARY = "Development files for libbzip3"
DESCRIPTION = "Development headers and library files for BZip3."
LICENSE = "BSD-2-Clause & LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "bzip3-devel-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "dd2fc598d876b7cca758fdef719a2f423d7c7bc895d3bdbdfb86f24ebf9e007eb47bea57e9dba34c07e08004a6b0dd2cca1305b405605f0d4371552803743a30"

RPROVIDES:${PN} += "bzip3-devel \
bzip3-devel(aarch-64) \
pkgconfig(bzip3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbzip3-0"

inherit rpm
