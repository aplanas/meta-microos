SUMMARY = "Translations for package libKPim5IMAP5"
DESCRIPTION = "Provides translations for the 'libKPim5IMAP5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5IMAP5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ca149abb3c08e1b9e1ec95f76bd9b1843fd3cdaf90283688914de1ac681ce0f0ed339469dbbaba2f70856408c8390451b979eb265420f32fb2716f9efba5ab7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5IMAP5-lang \
libKPim5IMAP5-lang-all \
locale(libKPim5IMAP5:ar) \
locale(libKPim5IMAP5:bs) \
locale(libKPim5IMAP5:ca) \
locale(libKPim5IMAP5:ca@valencia) \
locale(libKPim5IMAP5:cs) \
locale(libKPim5IMAP5:da) \
locale(libKPim5IMAP5:de) \
locale(libKPim5IMAP5:el) \
locale(libKPim5IMAP5:en_GB) \
locale(libKPim5IMAP5:eo) \
locale(libKPim5IMAP5:es) \
locale(libKPim5IMAP5:et) \
locale(libKPim5IMAP5:eu) \
locale(libKPim5IMAP5:fi) \
locale(libKPim5IMAP5:fr) \
locale(libKPim5IMAP5:ga) \
locale(libKPim5IMAP5:gl) \
locale(libKPim5IMAP5:hu) \
locale(libKPim5IMAP5:ia) \
locale(libKPim5IMAP5:it) \
locale(libKPim5IMAP5:ja) \
locale(libKPim5IMAP5:ka) \
locale(libKPim5IMAP5:kk) \
locale(libKPim5IMAP5:km) \
locale(libKPim5IMAP5:ko) \
locale(libKPim5IMAP5:lt) \
locale(libKPim5IMAP5:lv) \
locale(libKPim5IMAP5:mr) \
locale(libKPim5IMAP5:nb) \
locale(libKPim5IMAP5:nds) \
locale(libKPim5IMAP5:nl) \
locale(libKPim5IMAP5:nn) \
locale(libKPim5IMAP5:pa) \
locale(libKPim5IMAP5:pl) \
locale(libKPim5IMAP5:pt) \
locale(libKPim5IMAP5:pt_BR) \
locale(libKPim5IMAP5:ro) \
locale(libKPim5IMAP5:ru) \
locale(libKPim5IMAP5:sk) \
locale(libKPim5IMAP5:sl) \
locale(libKPim5IMAP5:sq) \
locale(libKPim5IMAP5:sr) \
locale(libKPim5IMAP5:sr@ijekavian) \
locale(libKPim5IMAP5:sr@ijekavianlatin) \
locale(libKPim5IMAP5:sr@latin) \
locale(libKPim5IMAP5:sv) \
locale(libKPim5IMAP5:tr) \
locale(libKPim5IMAP5:ug) \
locale(libKPim5IMAP5:uk) \
locale(libKPim5IMAP5:zh_CN) \
locale(libKPim5IMAP5:zh_TW)"

RDEPENDS:${PN} += "libKPim5IMAP5"

inherit rpm
