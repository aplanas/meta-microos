SUMMARY = "Devel files for Criterion"
DESCRIPTION = "Contains all needed devel files for Criterion."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "libcriterion3-devel-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "b29f2fb09e12143258f52976462cd8526a0ccff97b90880033474de20b65d402bd1efc8f2af4c833b79eee199bd305d5b43328fc694bb6393383895875c3c5f2"

RPROVIDES:${PN} += "libcriterion3-devel \
pkgconfig-criterion"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcriterion3 \
pkgconfig-boxfort \
pkgconfig-libffi \
pkgconfig-libgit2 \
pkgconfig-nanomsg"

inherit rpm
