SUMMARY = "Tools to work with documents in StarOffice formats"
DESCRIPTION = "This package contains tools to work with documents in StarOffice file-format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.0.7"

RPM_NAME = "libstaroffice-tools-0.0.7-3.9.aarch64.rpm"
RPM_HASH = "eed1cf172077b04711a79b5f518697ea3c9644247bb5b85c7aa4905f55bf067865d3bc2c6f37b0aea6023dc286f4025bedc6d0a481a9a71e8eb95018025160e9"

RPROVIDES:${PN} += "libstaroffice-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
librevenge-generators-0.0.so.0 \
librevenge-stream-0.0.so.0 \
libstaroffice-0.0.so.0 \
libstdc++.so.6"

inherit rpm
