SUMMARY = "Development files of Rime"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the development headers of Rime."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "librime-devel-1.7.3-2.20.aarch64.rpm"
RPM_HASH = "720ea3e00aa0efbba51ad37f1a32d341bd82e894cc45db067a5924d0d667c9b74e5ae5978440fc7e0f0bb1ed6e66c10b54b54ba2ac761d91ea4443ac61e53996"

RPROVIDES:${PN} += "cmake-Rime \
librime-devel \
pkgconfig-rime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
rime"

inherit rpm
