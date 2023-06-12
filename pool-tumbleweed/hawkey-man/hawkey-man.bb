SUMMARY = "Documentation for the hawkey Python bindings"
DESCRIPTION = "This package provides the man pages for the hawkey Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "hawkey-man-0.70.1-1.1.noarch.rpm"
RPM_HASH = "d3178b3d1ce413a2337275da6b0b9255352d354434cfd946b5c16c7c8cd32552db8a857d33e2f402c01eaa6e2f788dcf6fd8e3f8611ab1ff4ecd05401ee03a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hawkey-man"
RDEPENDS:${PN} += ""

inherit rpm
