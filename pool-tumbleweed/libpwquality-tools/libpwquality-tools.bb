SUMMARY = "Tools from libpequality, a library for password quality checking"
DESCRIPTION = "libpwquality is a library for password quality checks and generation \
of random passwords that pass the checks. \
 \
This package contains simple tools that use libpwquality."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "libpwquality-tools-1.4.5-1.3.aarch64.rpm"
RPM_HASH = "254aa7e904b0b1cc7aca63b61faa049bba5ab3a85964eb9996b910bfca3d2903ad59bd6bbb2e544ed85a21a0dfb21f22ccc8e60aa24cab094243a155ca121ea3"

RPROVIDES:${PN} += "libpwquality-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpwquality.so.1"

inherit rpm
