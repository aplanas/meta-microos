SUMMARY = "Translations for package cups-pk-helper"
DESCRIPTION = "Provides translations for the 'cups-pk-helper' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.7"

RPM_NAME = "cups-pk-helper-lang-0.2.7-1.4.noarch.rpm"
RPM_HASH = "176cdfc60509793d07d0be2adb885283e9dbaef9f2e8c062a6e7e8e8bfc519ea8166cf0f60f6a710e38be2aaff383bad38655c48b9574cad83bc158705536c1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cups-pk-helper-lang cups-pk-helper-lang-all locale(cups-pk-helper:af) locale(cups-pk-helper:ast) locale(cups-pk-helper:ca) locale(cups-pk-helper:cs) locale(cups-pk-helper:da) locale(cups-pk-helper:de) locale(cups-pk-helper:en_GB) locale(cups-pk-helper:eo) locale(cups-pk-helper:es) locale(cups-pk-helper:et) locale(cups-pk-helper:eu) locale(cups-pk-helper:fi) locale(cups-pk-helper:fr) locale(cups-pk-helper:fur) locale(cups-pk-helper:gl) locale(cups-pk-helper:he) locale(cups-pk-helper:hr) locale(cups-pk-helper:hu) locale(cups-pk-helper:ia) locale(cups-pk-helper:id) locale(cups-pk-helper:it) locale(cups-pk-helper:ja) locale(cups-pk-helper:ka) locale(cups-pk-helper:kk) locale(cups-pk-helper:ko) locale(cups-pk-helper:lt) locale(cups-pk-helper:lv) locale(cups-pk-helper:nl) locale(cups-pk-helper:oc) locale(cups-pk-helper:pl) locale(cups-pk-helper:pt) locale(cups-pk-helper:pt_BR) locale(cups-pk-helper:ru) locale(cups-pk-helper:si) locale(cups-pk-helper:sk) locale(cups-pk-helper:sl) locale(cups-pk-helper:sr) locale(cups-pk-helper:sv) locale(cups-pk-helper:tr) locale(cups-pk-helper:uk) locale(cups-pk-helper:zh_CN) locale(cups-pk-helper:zh_TW)"
RDEPENDS:${PN} += "cups-pk-helper"

inherit rpm
