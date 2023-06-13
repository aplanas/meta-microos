SUMMARY = "Tools from libpequality, a library for password quality checking"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package contains simple tools that use libpwquality."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-tools-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "53988ca6091aa5aaba4d95bbbbaa8590883b02ad52a1d718be5192db973f71800d107dea84560951548814042631a3c83c6dc76d4700fe541761579f45b2284f"

RPROVIDES:${PN} += "libpwquality-tools \
libpwquality-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpwquality.so.1()(64bit)"

inherit rpm
