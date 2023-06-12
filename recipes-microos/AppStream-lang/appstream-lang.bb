SUMMARY = "Translations for package AppStream"
DESCRIPTION = "Provides translations for the 'AppStream' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "AppStream-lang-0.16.1-3.1.noarch.rpm"
RPM_HASH = "803211df9532399c7f53904874d02830cf26164d51ff700ec06369b9716e2b5b81404a0672be73ed578ad11606fad60c0f9473342dc80407b88412bfa05b860a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AppStream-lang \
AppStream-lang-all \
locale(AppStream:ar) \
locale(AppStream:bn) \
locale(AppStream:ca) \
locale(AppStream:cs) \
locale(AppStream:da) \
locale(AppStream:de) \
locale(AppStream:en_GB) \
locale(AppStream:eo) \
locale(AppStream:es) \
locale(AppStream:et) \
locale(AppStream:eu) \
locale(AppStream:fi) \
locale(AppStream:fr) \
locale(AppStream:gd) \
locale(AppStream:gl) \
locale(AppStream:he) \
locale(AppStream:hi) \
locale(AppStream:hr) \
locale(AppStream:hu) \
locale(AppStream:id) \
locale(AppStream:it) \
locale(AppStream:ja) \
locale(AppStream:ka) \
locale(AppStream:ko) \
locale(AppStream:lt) \
locale(AppStream:nb) \
locale(AppStream:nl) \
locale(AppStream:oc) \
locale(AppStream:pl) \
locale(AppStream:pt) \
locale(AppStream:pt_BR) \
locale(AppStream:ro) \
locale(AppStream:ru) \
locale(AppStream:sk) \
locale(AppStream:sl) \
locale(AppStream:sr) \
locale(AppStream:sr@latin) \
locale(AppStream:sv) \
locale(AppStream:tr) \
locale(AppStream:uk) \
locale(AppStream:zh_CN) \
locale(AppStream:zh_TW)"
RDEPENDS:${PN} += "AppStream"

inherit rpm
