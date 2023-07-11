SUMMARY = "Development files for the Algorithmic Differentiation Library"
DESCRIPTION = "This package provides the development environment for ADOL-C \
(Automatic Differentiation by OverLoading in C++)."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "adolc-devel-2.7.2-2.4.aarch64.rpm"
RPM_HASH = "a615864153329c3a548dc7be8b3cc77536fbbbfdd8fe78d15d211687d89a29a9a759a715bbd4d7f17e1063981a392133576f80b78d92907bac519655d82a41eb"

RPROVIDES:${PN} += "adolc-devel \
pkgconfig-adolc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadolc2"

inherit rpm
