SUMMARY = "Translations for package dpkg"
DESCRIPTION = "Provides translations for the 'dpkg' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-lang-1.21.8-2.1.noarch.rpm"
RPM_HASH = "750cefcbb83d83e2e793f31e2d347c131411446472dcfc8535d9cfefe7e7bc2e6321862f9c3e02f1132d8ef3388ea4efd824c555f1173553894efde8751119cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpkg-lang \
dpkg-lang-all \
locale(dpkg:ast) \
locale(dpkg:bs) \
locale(dpkg:ca) \
locale(dpkg:cs) \
locale(dpkg:da) \
locale(dpkg:de) \
locale(dpkg:dz) \
locale(dpkg:el) \
locale(dpkg:eo) \
locale(dpkg:es) \
locale(dpkg:et) \
locale(dpkg:eu) \
locale(dpkg:fr) \
locale(dpkg:gl) \
locale(dpkg:hu) \
locale(dpkg:id) \
locale(dpkg:it) \
locale(dpkg:ja) \
locale(dpkg:km) \
locale(dpkg:ko) \
locale(dpkg:lt) \
locale(dpkg:mr) \
locale(dpkg:nb) \
locale(dpkg:ne) \
locale(dpkg:nl) \
locale(dpkg:nn) \
locale(dpkg:oc) \
locale(dpkg:pa) \
locale(dpkg:pl) \
locale(dpkg:pt) \
locale(dpkg:pt_BR) \
locale(dpkg:ro) \
locale(dpkg:ru) \
locale(dpkg:sk) \
locale(dpkg:sv) \
locale(dpkg:th) \
locale(dpkg:tr) \
locale(dpkg:vi) \
locale(dpkg:zh_CN) \
locale(dpkg:zh_TW)"
RDEPENDS:${PN} += "dpkg"

inherit rpm
