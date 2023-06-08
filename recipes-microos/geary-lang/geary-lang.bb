SUMMARY = "Translations for package geary"
DESCRIPTION = "Provides translations for the 'geary' package."
LICENSE = "BSD-2-Clause & CC-BY-3.0 & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "geary-lang-43.0-3.1.noarch.rpm"
RPM_HASH = "b5eb5fd7bd59d7288396b434d680a8f0f7d159157222f811c74496b3a9a1a2541fcb6317e3fc147f8591fc3068f3241bec072c5624d1e2042a8643233b116293"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geary-lang geary-lang-all locale(geary:ar) locale(geary:be) locale(geary:bs) locale(geary:ca) locale(geary:cs) locale(geary:da) locale(geary:de) locale(geary:el) locale(geary:en_CA) locale(geary:en_GB) locale(geary:eo) locale(geary:es) locale(geary:et) locale(geary:eu) locale(geary:fa) locale(geary:fi) locale(geary:fr) locale(geary:fur) locale(geary:gl) locale(geary:he) locale(geary:hi) locale(geary:hr) locale(geary:hu) locale(geary:id) locale(geary:it) locale(geary:ja) locale(geary:kk) locale(geary:km) locale(geary:lt) locale(geary:ms) locale(geary:nb) locale(geary:nl) locale(geary:oc) locale(geary:pl) locale(geary:pt) locale(geary:pt_BR) locale(geary:ro) locale(geary:ru) locale(geary:sk) locale(geary:sl) locale(geary:sr) locale(geary:sr@latin) locale(geary:sv) locale(geary:te) locale(geary:tr) locale(geary:uk) locale(geary:vi) locale(geary:zh_CN) locale(geary:zh_TW)"
RDEPENDS:${PN} += "geary"

inherit rpm
