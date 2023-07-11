SUMMARY = "Distributed Compile Wrappers for Clang"
DESCRIPTION = "Wrapper symlinks for clang/clang++ for icecream distributed building."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.0"

RPM_NAME = "icecream-clang-wrappers-1.4.0-2.6.aarch64.rpm"
RPM_HASH = "bc05ae89fc94a24b4e3985ade1349aaddd0cffe1b342ed4fa64c7694176f456d69c53800867eeba138d0de3f712c981fd85c267cf1fbab2d902e54661aca57aa"

RPROVIDES:${PN} += "icecream-clang-wrappers"

RDEPENDS:${PN} += "clang \
icecream"

inherit rpm
