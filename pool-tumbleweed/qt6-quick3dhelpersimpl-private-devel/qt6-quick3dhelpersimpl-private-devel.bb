SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DHelpersImpl library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DHelpersImpl that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dhelpersimpl-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "1ff07e4dd2e8e02823d3f1d022232797d4bfef5a310fc812afd9cde1309d93dcb13205ebc427126f7a10ae9e7ec89777d38aa8c28c494f8830c8caed030f8731"

RPROVIDES:${PN} += "qt6-quick3dhelpersimpl-private-devel \
qt6-quick3dhelpersimpl-private-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt6Quick3DHelpersImpl)"

inherit rpm
