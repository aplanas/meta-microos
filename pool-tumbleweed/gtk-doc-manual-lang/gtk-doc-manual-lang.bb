SUMMARY = "Translations for package gtk-doc-manual"
DESCRIPTION = "Provides translations for the 'gtk-doc-manual' package."
LICENSE = "GFDL-1.1-or-later"

PV = "1.33.2"

RPM_NAME = "gtk-doc-manual-lang-1.33.2-1.4.noarch.rpm"
RPM_HASH = "fe1f040ed2bcc37302d1ebac17329b8c2567f8d0c7009a0069de325723a83060c6a0a9cb1c354dadd2b0bb013c916823648e492fd6ea5fdb0adeb5f0c03e8fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk-doc-manual-lang \
gtk-doc-manual-lang-all"
RDEPENDS:${PN} += "gtk-doc-manual"

inherit rpm
