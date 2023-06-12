SUMMARY = "Languages for libgviewv4l2core"
DESCRIPTION = "Provides translations to libgviewv4l2core."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "libgviewv4l2core-lang-2.0.8-1.7.noarch.rpm"
RPM_HASH = "9cab90887fe88255dc9d69688bed83e58f8703dc4dad8895212f41f30abf35fb0342a18cfafda520ffe887b54490a329254cc2061455354c45b1fb0337aa280f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgviewv4l2core-lang \
libgviewv4l2core-lang-all \
locale(libgviewv4l2core:bg) \
locale(libgviewv4l2core:bs) \
locale(libgviewv4l2core:cs) \
locale(libgviewv4l2core:da) \
locale(libgviewv4l2core:de) \
locale(libgviewv4l2core:en_AU) \
locale(libgviewv4l2core:es) \
locale(libgviewv4l2core:eu) \
locale(libgviewv4l2core:fr) \
locale(libgviewv4l2core:gl) \
locale(libgviewv4l2core:he) \
locale(libgviewv4l2core:hr) \
locale(libgviewv4l2core:it) \
locale(libgviewv4l2core:ja) \
locale(libgviewv4l2core:lv) \
locale(libgviewv4l2core:nl) \
locale(libgviewv4l2core:pl) \
locale(libgviewv4l2core:pt) \
locale(libgviewv4l2core:pt_BR) \
locale(libgviewv4l2core:ru) \
locale(libgviewv4l2core:si) \
locale(libgviewv4l2core:sr) \
locale(libgviewv4l2core:tr) \
locale(libgviewv4l2core:uk) \
locale(libgviewv4l2core:zh_TW)"
RDEPENDS:${PN} += "libgviewv4l2core-2_1-2"

inherit rpm
