SUMMARY = "Translations for package libshumate"
DESCRIPTION = "Provides translations for the 'libshumate' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.3"

RPM_NAME = "libshumate-lang-1.0.3-1.3.noarch.rpm"
RPM_HASH = "66ba2aede14502aeec807783e9896afc88052458b407665b653d15905888fbe2b5233329443d45716029018278de1c96c16384257626117b84968f81c26a0844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libshumate-lang \
libshumate-lang-all \
locale(libshumate:bg) \
locale(libshumate:ca) \
locale(libshumate:cs) \
locale(libshumate:da) \
locale(libshumate:de) \
locale(libshumate:es) \
locale(libshumate:eu) \
locale(libshumate:fa) \
locale(libshumate:fi) \
locale(libshumate:fr) \
locale(libshumate:fur) \
locale(libshumate:gl) \
locale(libshumate:he) \
locale(libshumate:hr) \
locale(libshumate:hu) \
locale(libshumate:id) \
locale(libshumate:it) \
locale(libshumate:ka) \
locale(libshumate:kk) \
locale(libshumate:ko) \
locale(libshumate:lt) \
locale(libshumate:lv) \
locale(libshumate:ne) \
locale(libshumate:nl) \
locale(libshumate:oc) \
locale(libshumate:pl) \
locale(libshumate:pt) \
locale(libshumate:pt_BR) \
locale(libshumate:ru) \
locale(libshumate:sl) \
locale(libshumate:sr) \
locale(libshumate:sv) \
locale(libshumate:tr) \
locale(libshumate:uk) \
locale(libshumate:zh_CN)"
RDEPENDS:${PN} += "libshumate"

inherit rpm
