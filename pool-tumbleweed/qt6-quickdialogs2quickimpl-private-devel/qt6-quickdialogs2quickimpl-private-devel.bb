SUMMARY = "Non-ABI stable API for the Qt 6 QuickDialogs2Impl library"
DESCRIPTION = "This package provides private headers of libQt6QuickDialogs2Impl that do not \
have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-quickdialogs2quickimpl-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "b43f654be93c47886f6d1a1c8db5f4b5fe8557e81c3682495650b2db27264bb7355c837bcbe82fd041bd6ca2dfb0bc5820db61794896e838ce989e349b137c5d"

RPROVIDES:${PN} += "qt6-quickdialogs2quickimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6QuickDialogs2QuickImpl"

inherit rpm
