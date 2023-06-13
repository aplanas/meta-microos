SUMMARY = "Translations for package spacefm"
DESCRIPTION = "Provides translations for the 'spacefm' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "spacefm-lang-1.0.6-3.13.noarch.rpm"
RPM_HASH = "8457c213d7a09fe9015693b089565ed16648e65502aecf26a0f9757b8d37ffe73975e2f7616be83c79e11a210021bbe2803bea1fd882ade0e26b8c52b09c5d9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(spacefm:af) \
locale(spacefm:ar) \
locale(spacefm:bg) \
locale(spacefm:bn_IN) \
locale(spacefm:ca) \
locale(spacefm:cs) \
locale(spacefm:da) \
locale(spacefm:de) \
locale(spacefm:el) \
locale(spacefm:es) \
locale(spacefm:et) \
locale(spacefm:eu) \
locale(spacefm:fa) \
locale(spacefm:fi) \
locale(spacefm:fr) \
locale(spacefm:gl) \
locale(spacefm:he) \
locale(spacefm:hr) \
locale(spacefm:hu) \
locale(spacefm:id) \
locale(spacefm:it) \
locale(spacefm:ja) \
locale(spacefm:km) \
locale(spacefm:ko) \
locale(spacefm:lt) \
locale(spacefm:ml) \
locale(spacefm:ms) \
locale(spacefm:nb) \
locale(spacefm:nl) \
locale(spacefm:nn) \
locale(spacefm:pl) \
locale(spacefm:pt) \
locale(spacefm:pt_BR) \
locale(spacefm:ru) \
locale(spacefm:sk) \
locale(spacefm:sl) \
locale(spacefm:sr) \
locale(spacefm:sr@latin) \
locale(spacefm:sv) \
locale(spacefm:tr) \
locale(spacefm:uk) \
locale(spacefm:vi) \
locale(spacefm:zh_CN) \
locale(spacefm:zh_TW) \
spacefm-lang \
spacefm-lang-all"

RDEPENDS:${PN} += "spacefm"

inherit rpm
