SUMMARY = "Development package for mtdev library"
DESCRIPTION = "This package contains the files needed to compile programs that use mtdev library."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "mtdev-devel-1.1.6-1.10.aarch64.rpm"
RPM_HASH = "649704a398165230096035ec30eb725cc20b34c00ae5a967e5f180c18c9f198d24c45a7377371b909aab5cdd4bdab8524bf5ebc58c4a49219a62aebd09aa983f"

RPROVIDES:${PN} += "mtdev-devel \
mtdev-devel(aarch-64) \
pkgconfig(mtdev)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libmtdev1"

inherit rpm
