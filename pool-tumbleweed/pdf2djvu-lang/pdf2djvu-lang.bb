SUMMARY = "Translations for package pdf2djvu"
DESCRIPTION = "Provides translations for the 'pdf2djvu' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-lang-0.9.19-3.10.noarch.rpm"
RPM_HASH = "5f2d27c22cc5ec6cc230d356d4a8b9babeac5b315c13bd6bf192144187a642ad28e2874f0ecd103d3c18c73bbd632589e7849e44e8ec983960bce70332b8ed8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pdf2djvu-de \
locale-pdf2djvu-pl \
locale-pdf2djvu-pt \
locale-pdf2djvu-ru \
locale-pdf2djvu-uk \
pdf2djvu-lang \
pdf2djvu-lang-all"

RDEPENDS:${PN} += "pdf2djvu"

inherit rpm
