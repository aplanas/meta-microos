SUMMARY = "XTRX Low-level API library - devel"
DESCRIPTION = "Low level XTRX hardware abstraction library. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libxtrxll."
LICENSE = "LGPL-2.1-only"

PV = "0.0.0+git.20201202"

RPM_NAME = "libxtrxll-devel-0.0.0+git.20201202-2.7.aarch64.rpm"
RPM_HASH = "bf473f40f9d874a8fb3667907155dc639956003fc4bb707c69a7587e7c37404e6f528148ae772d07349d19ff763dd606a50a37526c56d68359ce0f1fea62d857"

RPROVIDES:${PN} += "libxtrxll-devel \
pkgconfig-libxtrxll"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxtrxll0"

inherit rpm
