SUMMARY = "XTRX Low-level API library - devel"
DESCRIPTION = "Low level XTRX hardware abstraction library. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrxll."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrxll-devel-0.0.0+git.20201202-2.6.aarch64.rpm"
RPM_HASH = "1703106b82357480156ab19df60d3520853a5679a800a73ec9e12fd256712fcafbb4d66feb6622dde4a42dea9cdd585663e8dbfc3225690f4e9e7f49e15e8ba7"

RPROVIDES:${PN} += "libxtrxll-devel \
libxtrxll-devel(aarch-64) \
pkgconfig(libxtrxll)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrxll0"

inherit rpm
