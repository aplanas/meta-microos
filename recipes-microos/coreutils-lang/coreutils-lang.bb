SUMMARY = "Translations for package coreutils"
DESCRIPTION = "Provides translations for the 'coreutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "9.3"

RPM_NAME = "coreutils-lang-9.3-1.1.noarch.rpm"
RPM_HASH = "8cf3185a2552405c932eee76e9d61e57cefd3abc3891abc3c0bcec3e3906a500c83648eb4b67a312a79468ae1d00ce32b7130146ce775625fb6c947b2821ceda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-lang coreutils-lang-all locale(coreutils:af) locale(coreutils:be) locale(coreutils:bg) locale(coreutils:ca) locale(coreutils:cs) locale(coreutils:da) locale(coreutils:de) locale(coreutils:el) locale(coreutils:eo) locale(coreutils:es) locale(coreutils:et) locale(coreutils:eu) locale(coreutils:fi) locale(coreutils:fr) locale(coreutils:ga) locale(coreutils:gl) locale(coreutils:hr) locale(coreutils:hu) locale(coreutils:ia) locale(coreutils:id) locale(coreutils:it) locale(coreutils:ja) locale(coreutils:ka) locale(coreutils:kk) locale(coreutils:ko) locale(coreutils:lt) locale(coreutils:ms) locale(coreutils:nb) locale(coreutils:nl) locale(coreutils:pl) locale(coreutils:pt) locale(coreutils:pt_BR) locale(coreutils:ro) locale(coreutils:ru) locale(coreutils:sk) locale(coreutils:sl) locale(coreutils:sr) locale(coreutils:sv) locale(coreutils:tr) locale(coreutils:uk) locale(coreutils:vi) locale(coreutils:zh_CN) locale(coreutils:zh_TW)"
RDEPENDS:${PN} += "coreutils"

inherit rpm
