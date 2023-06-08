SUMMARY = "GCC plugins development enviroment"
DESCRIPTION = "Files required for developing and compiling GCC plugins."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-devel-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "f3fc464fb12b9d2639b9ab4815ce64a7f1115a9c945f7ce777250ac6707320ca83ea05311fdb953d331d4d315e560b4abab66b0b76cc6db7c6b5e80119fc9720"

RPROVIDES:${PN} += "gcc12-devel gcc12-devel(aarch-64)"
RDEPENDS:${PN} += "gcc12 gmp-devel libc.so.6(GLIBC_2.34)(64bit) mpc-devel"

inherit rpm
