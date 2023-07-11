SUMMARY = "Development package for libkleo"
DESCRIPTION = "The development package for the libkleo libraries."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkleo-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "acd4476c91d68433f16e96756e33bf32928048ff9429b7953deea00e656bd01bfc25dc820f76231e59d4a956c86d9abdb02b9ab7d8c441847ae9ce6eec95dff5"

RPROVIDES:${PN} += "cmake-KF5Libkleo \
cmake-KPim5Libkleo \
libkleo-devel"

RDEPENDS:${PN} += "cmake-QGpgme \
libKPim5libkleo5 \
libgpgmepp-devel"

inherit rpm
