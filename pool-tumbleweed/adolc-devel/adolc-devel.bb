SUMMARY = "Development files for the Algorithmic Differentiation Library"
DESCRIPTION = "This package provides the development environment for ADOL-C \
(Automatic Differentiation by OverLoading in C++)."
LICENSE = "EPL-1.0 | GPL-2.0-or-later"

PV = "2.7.2"

RPM_NAME = "adolc-devel-2.7.2-2.3.aarch64.rpm"
RPM_HASH = "c54c037829d6eadfa192a12c44ced97ec8ccf43e37bd9585a67b98ac9e87b120dd76ab31ac03c1cbc3eb69dbe6527e5d51b6d5918e0d5f8f9fd91a86ba0dd8b3"

RPROVIDES:${PN} += "adolc-devel \
adolc-devel(aarch-64) \
pkgconfig(adolc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadolc2"

inherit rpm
