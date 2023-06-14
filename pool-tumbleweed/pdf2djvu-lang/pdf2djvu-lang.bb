SUMMARY = "Translations for package pdf2djvu"
DESCRIPTION = "Provides translations for the 'pdf2djvu' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-lang-0.9.19-3.6.noarch.rpm"
RPM_HASH = "0547f53fa29459e6d78b1ef91a4f5c8cb8e45d70069ad2a382f8fb17dbd2457fc7237bbd342910be69941a89a23ee1c0a459c2131830aca6b93f9920ad0a9ff2"
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
