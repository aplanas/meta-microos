SUMMARY = "Translations for package ciano"
DESCRIPTION = "Provides translations for the 'ciano' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "ciano-lang-0.2.4-1.22.noarch.rpm"
RPM_HASH = "8d7f03f1bd54b5c2231772385e5d9f9de7017db9470489cbdcfb145a6711a60be83b0d09f3dafad1d507a398b4fc6fd7638877fc2cf70946942cae4f5387cb37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ciano-lang ciano-lang-all locale(ciano:da) locale(ciano:es) locale(ciano:fr) locale(ciano:lt) locale(ciano:nl) locale(ciano:pt) locale(ciano:pt_BR) locale(ciano:tr) locale(ciano:zh_CN)"
RDEPENDS:${PN} += "ciano"

inherit rpm
