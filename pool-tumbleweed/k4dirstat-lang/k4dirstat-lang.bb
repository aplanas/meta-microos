SUMMARY = "Translations for package k4dirstat"
DESCRIPTION = "Provides translations for the 'k4dirstat' package."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.2"

RPM_NAME = "k4dirstat-lang-3.4.2-1.3.noarch.rpm"
RPM_HASH = "9fe4193dbf84c8b840d6e44d9e419b17e42e7f6e679521fc2e1a498851378d903ffaae49f52d1c5e237fd0ba7063c93031d43f32447bfe5df5dc970de2f7893a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k4dirstat-lang \
k4dirstat-lang-all \
locale(k4dirstat:ca) \
locale(k4dirstat:de) \
locale(k4dirstat:es_AR) \
locale(k4dirstat:fr) \
locale(k4dirstat:hu) \
locale(k4dirstat:it) \
locale(k4dirstat:ja) \
locale(k4dirstat:lt) \
locale(k4dirstat:lv) \
locale(k4dirstat:nl)"

RDEPENDS:${PN} += "k4dirstat"

inherit rpm
