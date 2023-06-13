SUMMARY = "Translations for package plasma-pass"
DESCRIPTION = "Provides translations for the 'plasma-pass' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "plasma-pass-lang-1.2.0-3.8.noarch.rpm"
RPM_HASH = "7f363941136bed3b32008b59130f3dfee0696cdf10cf0bce54733da4e5bb0655a9bf7f332f413ac6a0ed7d8838f6ac7d894b0aeb3bcbc673a1db8394b5fe8721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma-pass:ast) \
locale(plasma-pass:az) \
locale(plasma-pass:ca) \
locale(plasma-pass:ca@valencia) \
locale(plasma-pass:cs) \
locale(plasma-pass:da) \
locale(plasma-pass:de) \
locale(plasma-pass:el) \
locale(plasma-pass:en_GB) \
locale(plasma-pass:es) \
locale(plasma-pass:et) \
locale(plasma-pass:eu) \
locale(plasma-pass:fi) \
locale(plasma-pass:fr) \
locale(plasma-pass:gl) \
locale(plasma-pass:hi) \
locale(plasma-pass:hu) \
locale(plasma-pass:ia) \
locale(plasma-pass:it) \
locale(plasma-pass:ko) \
locale(plasma-pass:lt) \
locale(plasma-pass:nl) \
locale(plasma-pass:nn) \
locale(plasma-pass:pa) \
locale(plasma-pass:pl) \
locale(plasma-pass:pt) \
locale(plasma-pass:pt_BR) \
locale(plasma-pass:ro) \
locale(plasma-pass:ru) \
locale(plasma-pass:sk) \
locale(plasma-pass:sl) \
locale(plasma-pass:sv) \
locale(plasma-pass:uk) \
locale(plasma-pass:zh_TW) \
plasma-pass-lang \
plasma-pass-lang-all"

RDEPENDS:${PN} += "plasma-pass"

inherit rpm
