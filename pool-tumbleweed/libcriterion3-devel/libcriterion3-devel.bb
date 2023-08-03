SUMMARY = "Devel files for Criterion"
DESCRIPTION = "Contains all needed devel files for Criterion."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "libcriterion3-devel-2.4.2-1.2.aarch64.rpm"
RPM_HASH = "1476ac2aefbcf562d9886e10c3f4b2951634ff369bea3933b73f892008b7a4dd584e3a0769eeabd2edf3ae7bf796e156cf7e3a8581369cbd079b3d4a07e11da6"

RPROVIDES:${PN} += "libcriterion3-devel \
pkgconfig-criterion"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcriterion3 \
pkgconfig-boxfort \
pkgconfig-libffi \
pkgconfig-libgit2 \
pkgconfig-nanomsg"

inherit rpm
