SUMMARY = "Development Files for FriBiDi"
DESCRIPTION = "This package provides headers and manual files for FriBiDi."
LICENSE = "LGPL-2.1-only"

PV = "1.0.12"

RPM_NAME = "fribidi-devel-1.0.12-1.6.aarch64.rpm"
RPM_HASH = "9e27c7edf1b92c6552caa6a6bc18a12d2eefbf15d21213039b735bfcc9fa136cf9335ae2779f2de95270780abeacc75bf16e35433097dbb8bc3d16625129b949"

RPROVIDES:${PN} += "fribidi-devel \
fribidi-devel(aarch-64) \
pkgconfig(fribidi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfribidi0"

inherit rpm
