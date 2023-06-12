SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickRender library"
DESCRIPTION = "This package provides private headers of libQt63DQuickRender that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickrender-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c1a895eb255b19a5148787babf706222e5ea8ce5e113ea0835e33342c418bb9f8e2a469930985c22a15634df7132f515d8cf83e077a72a96ee469586913aff0b"

RPROVIDES:${PN} += "qt6-3dquickrender-private-devel \
qt6-3dquickrender-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickRender)"

inherit rpm
