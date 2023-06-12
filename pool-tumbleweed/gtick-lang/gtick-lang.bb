SUMMARY = "Translations for package gtick"
DESCRIPTION = "Provides translations for the 'gtick' package."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-lang-0.5.5-1.14.noarch.rpm"
RPM_HASH = "2245c895832beb81a68bc17474acb024518fed4b6c0c14e44d7ad9a52101c3f00994b366c519d7c3819d1c48edda1cd0bb665fb2feaf6be5f9f1b96d64295f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtick-lang \
gtick-lang-all \
locale(gtick:af) \
locale(gtick:ca) \
locale(gtick:cs) \
locale(gtick:da) \
locale(gtick:de) \
locale(gtick:en@boldquot) \
locale(gtick:en@quot) \
locale(gtick:eo) \
locale(gtick:es) \
locale(gtick:eu) \
locale(gtick:fa) \
locale(gtick:fi) \
locale(gtick:fr) \
locale(gtick:ga) \
locale(gtick:gl) \
locale(gtick:hu) \
locale(gtick:id) \
locale(gtick:it) \
locale(gtick:ko) \
locale(gtick:nl) \
locale(gtick:pl) \
locale(gtick:pt_BR) \
locale(gtick:ro) \
locale(gtick:ru) \
locale(gtick:sk) \
locale(gtick:sr) \
locale(gtick:sv) \
locale(gtick:uk) \
locale(gtick:vi) \
locale(gtick:zh_CN)"
RDEPENDS:${PN} += "gtick"

inherit rpm
