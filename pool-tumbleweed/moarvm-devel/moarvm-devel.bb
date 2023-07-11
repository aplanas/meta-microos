SUMMARY = "MoarVM development headers and libraries"
DESCRIPTION = "MoarVM (Metamodel On A Runtime) development headers."
LICENSE = "Artistic-2.0"

PV = "2022.07"

RPM_NAME = "moarvm-devel-2022.07-4.4.noarch.rpm"
RPM_HASH = "85a87194105b5e28f55385b412a74a98f872ad08cbdb2ead47a058a04673821df93ce4d5670624136b50417add719fb6c71ae51122b28bfdcded273a982453e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moarvm-devel \
pkgconfig-moar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
moarvm \
pkgconfig-libffi \
pkgconfig-libtommath \
pkgconfig-libuv \
pkgconfig-libzstd"

inherit rpm
