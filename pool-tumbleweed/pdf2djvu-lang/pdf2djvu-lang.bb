SUMMARY = "Translations for package pdf2djvu"
DESCRIPTION = "Provides translations for the 'pdf2djvu' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-lang-0.9.19-3.9.noarch.rpm"
RPM_HASH = "dcf4c5dd9bd374cb2f38e622d074029e88fb0663fe49a3f18a4f559674cf51cba54628f5a0fff6e72babc0131c415d893b9f89ae27462f52287b68884d4110e1"
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
