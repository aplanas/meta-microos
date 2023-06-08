SUMMARY = "Translations for package baloo5-file"
DESCRIPTION = "Provides translations for the 'baloo5-file' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "baloo5-file-lang-5.105.0-1.1.noarch.rpm"
RPM_HASH = "53736705c4da726e78a1783c60bcaff262e6a96df9aa9a0b5a42f77af51d80225a4948f057605db0a515722274599ea4a367982fc77bfc4ec2401f67c729dff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baloo5-file-lang baloo5-file-lang-all locale(baloo5-file:ar) locale(baloo5-file:az) locale(baloo5-file:bg) locale(baloo5-file:bs) locale(baloo5-file:ca) locale(baloo5-file:ca@valencia) locale(baloo5-file:cs) locale(baloo5-file:da) locale(baloo5-file:de) locale(baloo5-file:el) locale(baloo5-file:en_GB) locale(baloo5-file:es) locale(baloo5-file:et) locale(baloo5-file:eu) locale(baloo5-file:fi) locale(baloo5-file:fr) locale(baloo5-file:gd) locale(baloo5-file:gl) locale(baloo5-file:hu) locale(baloo5-file:ia) locale(baloo5-file:id) locale(baloo5-file:it) locale(baloo5-file:ja) locale(baloo5-file:ka) locale(baloo5-file:ko) locale(baloo5-file:lt) locale(baloo5-file:ml) locale(baloo5-file:nb) locale(baloo5-file:nds) locale(baloo5-file:nl) locale(baloo5-file:nn) locale(baloo5-file:pa) locale(baloo5-file:pl) locale(baloo5-file:pt) locale(baloo5-file:pt_BR) locale(baloo5-file:ro) locale(baloo5-file:ru) locale(baloo5-file:sk) locale(baloo5-file:sl) locale(baloo5-file:sr) locale(baloo5-file:sr@ijekavian) locale(baloo5-file:sr@ijekavianlatin) locale(baloo5-file:sr@latin) locale(baloo5-file:sv) locale(baloo5-file:ta) locale(baloo5-file:tr) locale(baloo5-file:uk) locale(baloo5-file:zh_CN) locale(baloo5-file:zh_TW)"
RDEPENDS:${PN} += "baloo5-file"

inherit rpm
