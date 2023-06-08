SUMMARY = "Translations for package entangle"
DESCRIPTION = "Provides translations for the 'entangle' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-lang-3.0-2.8.noarch.rpm"
RPM_HASH = "a27b6f54edd7e1b3050f83b21621495f049ff298b0ad263ebc22f48c5fa82f1d80f77670146420c10186351b50f6a694c554b3354991dc634c4541c924047375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "entangle-lang entangle-lang-all locale(entangle:bg) locale(entangle:ca) locale(entangle:cs) locale(entangle:de) locale(entangle:en_GB) locale(entangle:es) locale(entangle:eu) locale(entangle:fa) locale(entangle:fr) locale(entangle:he) locale(entangle:hu) locale(entangle:it) locale(entangle:ja) locale(entangle:nb_NO) locale(entangle:nl) locale(entangle:pl) locale(entangle:pt_BR) locale(entangle:sv) locale(entangle:tr) locale(entangle:uk) locale(entangle:zh_CN) locale(entangle:zh_TW)"
RDEPENDS:${PN} += "entangle"

inherit rpm
