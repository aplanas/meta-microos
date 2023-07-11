SUMMARY = "Development files for libref_array"
DESCRIPTION = "A dynamically-growing, reference-counted array"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "libref_array-devel-0.1.5-28.1.aarch64.rpm"
RPM_HASH = "d6be987eefdfe53ca2bc994392d20769238096fdd53f88d7299bfa0a7e2e56c4d8328a72b602fec24294be3b9204d642d5499b569c387141a04290748c1649a3"

RPROVIDES:${PN} += "libref-array-devel \
pkgconfig-ref-array"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libref-array1"

inherit rpm
