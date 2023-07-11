SUMMARY = "Static archives for SELinux's binary policy manipulation library"
DESCRIPTION = "The libsepol-devel-static package contains the static libraries \
needed for developing applications that manipulate binary SELinux \
policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol-devel-static-3.5-1.5.aarch64.rpm"
RPM_HASH = "f3cc33bfbc6d8fd9bd6e58acdfbcce0e3e636c0023bcb7712634841c026e46d1c7be9bb7ca7d8d90e63942d6bc93ab0b792c0f612e4568d8dee57e0586a35ad7"

RPROVIDES:${PN} += "libsepol-devel-static"

RDEPENDS:${PN} += "libsepol-devel"

inherit rpm
