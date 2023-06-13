SUMMARY = "Development package for SpeeX"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
SpeeX library."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "speex-devel-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "329fdd78a9bb1c27030b40106fa346b39fd50cc6a1c87451faf2335fb4ac87a112a4279d8f51ff61cb616e9af08bca563801b7717c437fda1414827b0b3bd4e4"

RPROVIDES:${PN} += "libspeex-devel \
pkgconfig(speex) \
speex-devel \
speex-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeex1 \
speexdsp-devel"

inherit rpm
