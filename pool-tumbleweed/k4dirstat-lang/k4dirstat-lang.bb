SUMMARY = "Translations for package k4dirstat"
DESCRIPTION = "Provides translations for the 'k4dirstat' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.2"

RPM_NAME = "k4dirstat-lang-3.4.2-1.4.noarch.rpm"
RPM_HASH = "45d769881d5060b6df42f0a960cf189d0ed4fface4bfea7b682675dee46a1c9f878538fdbc123c3a3ec6bde7cad309537535ac446e0b7315a530af6e0b6e5319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k4dirstat-lang \
k4dirstat-lang-all \
locale-k4dirstat-ca \
locale-k4dirstat-de \
locale-k4dirstat-es-AR \
locale-k4dirstat-fr \
locale-k4dirstat-hu \
locale-k4dirstat-it \
locale-k4dirstat-ja \
locale-k4dirstat-lt \
locale-k4dirstat-lv \
locale-k4dirstat-nl"

RDEPENDS:${PN} += "k4dirstat"

inherit rpm
