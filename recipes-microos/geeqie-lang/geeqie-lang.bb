SUMMARY = "Translations for package geeqie"
DESCRIPTION = "Provides translations for the 'geeqie' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "geeqie-lang-2.0.1-1.6.noarch.rpm"
RPM_HASH = "70a93eab0d881432cc5ef23dfa3ee9c2b0d6e9d98ed93909b339f582ffe9a528a731d3653bade0c018accc142305dd15b37d61cdd44cc341ff80d66781d45002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geeqie-lang geeqie-lang-all locale(geeqie:ar) locale(geeqie:be) locale(geeqie:bg) locale(geeqie:ca) locale(geeqie:cs) locale(geeqie:da) locale(geeqie:de) locale(geeqie:el) locale(geeqie:en_GB) locale(geeqie:eo) locale(geeqie:es) locale(geeqie:et) locale(geeqie:eu) locale(geeqie:fi) locale(geeqie:fr) locale(geeqie:hu) locale(geeqie:id) locale(geeqie:it) locale(geeqie:ja) locale(geeqie:ko) locale(geeqie:nb) locale(geeqie:nl) locale(geeqie:pl) locale(geeqie:pt_BR) locale(geeqie:ro) locale(geeqie:ru) locale(geeqie:sk) locale(geeqie:sl) locale(geeqie:sr) locale(geeqie:sr@latin) locale(geeqie:sv) locale(geeqie:th) locale(geeqie:tr) locale(geeqie:uk) locale(geeqie:vi) locale(geeqie:zh_CN) locale(geeqie:zh_TW)"
RDEPENDS:${PN} += "geeqie"

inherit rpm
