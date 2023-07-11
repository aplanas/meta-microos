SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-kmssupport-devel-static-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "6452cb9b691bd23ba614fba0eb8f1f932e4b36d78a4625902cc666d3cb8a682a99671e7d17e38f5a8d6008a6794cb692ea651dfc8f8a0592909eaa5110c02d58"

RPROVIDES:${PN} += "cmake-Qt6KmsSupportPrivate \
qt6-kmssupport-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
