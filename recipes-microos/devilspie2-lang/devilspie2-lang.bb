SUMMARY = "Translations for package devilspie2"
DESCRIPTION = "Provides translations for the 'devilspie2' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.43"

RPM_NAME = "devilspie2-lang-0.43-3.11.noarch.rpm"
RPM_HASH = "ad8f6c6e6859e926993bc99a88f53940f5ba58ad0eee550d285feb60f75ee204498673bce5ff41785d1eb75b97abbe4936cad7ab5dcc85aea0b93e5f9df8cf62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "devilspie2-lang devilspie2-lang-all locale(devilspie2:fi) locale(devilspie2:fr) locale(devilspie2:it) locale(devilspie2:ja) locale(devilspie2:nl) locale(devilspie2:pt_BR) locale(devilspie2:ru) locale(devilspie2:sv)"
RDEPENDS:${PN} += "devilspie2"

inherit rpm
