SUMMARY = "Static archives for SELinux's binary policy manipulation library"
DESCRIPTION = "The libsepol-devel-static package contains the static libraries \
needed for developing applications that manipulate binary SELinux \
policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsepol-devel-static-3.5-1.3.aarch64.rpm"
RPM_HASH = "b3d2cebe0f8cd1736d653c7b809718895b32b6b8c91b8ddd4ef1ee1b72e82735880784357a6c2f40687df0794690a1e86b3b4b559df9b55ed70a5632d92243e8"

RPROVIDES:${PN} += "libsepol-devel-static"

RDEPENDS:${PN} += "libsepol-devel"

inherit rpm
