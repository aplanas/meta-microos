SUMMARY = "Development package for libkomparediff2"
DESCRIPTION = "Development package for libkomparediff2."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.08.0"

RPM_NAME = "libkomparediff2-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "85894406c9e6e58e1a5aead419c59c3a13612b864fb8c42998dc112fdd283a76f6691979b1da030c1be82abd1e4184a6592df0e66a381afc2bd5c43477a344ac"

RPROVIDES:${PN} += "cmake-LibKompareDiff2 \
libkomparediff2-devel \
libkomparediff2-kf5-devel"

RDEPENDS:${PN} += "libkomparediff2-5"

inherit rpm
