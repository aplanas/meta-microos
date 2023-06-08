SUMMARY = "Translations for package cozy"
DESCRIPTION = "Provides translations for the 'cozy' package."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "cozy-lang-1.2.1-2.1.noarch.rpm"
RPM_HASH = "8b10a652264b3dcba84646e0d76ea0fea8c7a62cb9f8146b0cba5cc41062288a4ec6413d9392e187ae30f9b3122cd62e01c99e8e974e518de43f0e87dd8a721e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cozy-lang cozy-lang-all locale(cozy:bg) locale(cozy:cs) locale(cozy:da) locale(cozy:de) locale(cozy:el) locale(cozy:es) locale(cozy:fi) locale(cozy:fr) locale(cozy:gl) locale(cozy:hi) locale(cozy:hr) locale(cozy:it) locale(cozy:nl) locale(cozy:pl) locale(cozy:pt) locale(cozy:pt_BR) locale(cozy:ru) locale(cozy:sv) locale(cozy:tr) locale(cozy:uk) locale(cozy:zh)"
RDEPENDS:${PN} += "cozy"

inherit rpm
