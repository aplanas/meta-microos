SUMMARY = "Guile bindings of libgit2"
DESCRIPTION = "This package provides Guile bindings to libgit2, \
a library manipulate repositories of the Git version control system."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "guile-git-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "7d95211c5a43e2d8400fa05a5f91297aec51be114b6370068f996474e91a572371903494501a74f1da059435d8650e6225a481d0e8140afd7504bbb57684033f"

RPROVIDES:${PN} += "guile-git"

RDEPENDS:${PN} += "/usr/bin/sh \
guile \
guile-bytestructures \
libgit2-devel"

inherit rpm
