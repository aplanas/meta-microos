SUMMARY = "Development files for python3-shiboken6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-shiboken6-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "2d24f363fc6a6c9b0e0f46e8c1c55df6bfd9bfa5d38616b25496bf8cc195db7e1e16234e1f6f968b4241b246d993cf52b33dad304ebb388a6c4b4285c46d3ed4"

RPROVIDES:${PN} += "cmake-Shiboken6 \
cmake-Shiboken6Tools \
pkgconfig-shiboken6 \
python3-shiboken6-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-shiboken6"

inherit rpm
