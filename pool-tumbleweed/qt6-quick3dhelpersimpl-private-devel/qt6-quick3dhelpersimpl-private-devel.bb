SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpersImpl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpersimpl-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "8ec17f12631a9150e5772e1e260965795b533be739033eb961aaa31ae244f2a1716fe5e545ca11dfc676792a935e2ad1673f0cc524fe865f27af58cf6b229576"

RPROVIDES:${PN} += "qt6-quick3dhelpersimpl-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DHelpersImpl"

inherit rpm
