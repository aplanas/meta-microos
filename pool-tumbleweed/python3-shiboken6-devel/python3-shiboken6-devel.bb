SUMMARY = "Development files for python3-shiboken6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-shiboken6-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "e816016dd69c5425b083d2a48a02fda41b0ea1599bd3e315f14644a3c146ef2af1dd8e150804ca08fecdcb09445f20b2b3b4cf483dbe11f89aa8419bb113fefd"

RPROVIDES:${PN} += "cmake(Shiboken6) \
cmake(Shiboken6Tools) \
pkgconfig(shiboken6) \
python3-shiboken6-devel \
python3-shiboken6-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-shiboken6"

inherit rpm
