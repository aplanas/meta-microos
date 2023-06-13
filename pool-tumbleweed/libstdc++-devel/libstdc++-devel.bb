SUMMARY = "The system GNU C++ development files"
DESCRIPTION = "The system GNU C++ development files."
LICENSE = "GPL-3.0-only-WITH-GCC-exception-3.1"

PV = "13"

RPM_NAME = "libstdc++-devel-13-1.3.aarch64.rpm"
RPM_HASH = "6c4dd68fb0eefd822fe8c1bc108cff3f1c9faa855f20a6b5a1e45c8d247a3555ee4306bb9daf1fde022e98e39883412a645c5dca05116970a6cd9e05bc11549f"

RPROVIDES:${PN} += "libstdc++-devel \
libstdc++-devel(aarch-64)"

RDEPENDS:${PN} += "libstdc++6-devel-gcc13"

inherit rpm
