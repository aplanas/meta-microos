SUMMARY = "Static archives for SELinux's policy management library"
DESCRIPTION = "The libsemanage-devel-static package contains the static libraries \
needed for developing applications that manipulate binary policies."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5"

RPM_NAME = "libsemanage-devel-static-3.5-1.4.aarch64.rpm"
RPM_HASH = "2714b532c3d27fd450078584d686b59379c529f4efc01a555cdbb5f9ce33f0843f995e2ddb22a891f70fa6360533cad95019b213eb2db77cd3b2066ce152817f"

RPROVIDES:${PN} += "libsemanage-devel-static \
libsemanage-devel-static(aarch-64)"

RDEPENDS:${PN} += "libsemanage-devel"

inherit rpm
