SUMMARY = "Development package for libkleo"
DESCRIPTION = "The development package for the libkleo libraries."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkleo-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "41e69c33222709d54939ec7101abd7218b7c6478f514fc44a069276d47761df7802a2d9c680f9be4cab686e39b1dcfea6052015259e2f538c9ff340873af553f"

RPROVIDES:${PN} += "cmake(KF5Libkleo) \
cmake(KPim5Libkleo) \
libkleo-devel \
libkleo-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(QGpgme) \
libKPim5libkleo5 \
libgpgmepp-devel"

inherit rpm
