SUMMARY = "Translations for package claws-mail"
DESCRIPTION = "Provides translations for the 'claws-mail' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "claws-mail-lang-4.1.1-2.3.noarch.rpm"
RPM_HASH = "10e38df406a5fcb3bc9d50479a3c06fe608c65c7616beb7d1aa8468c1b42b6fd6570c5208a841131c99003b4d949fd5b900b461e8a6ae3febc1ff4960007b0ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "claws-mail-lang claws-mail-lang-all locale(claws-mail:ca) locale(claws-mail:cs) locale(claws-mail:da) locale(claws-mail:de) locale(claws-mail:el_GR) locale(claws-mail:en_GB) locale(claws-mail:es) locale(claws-mail:fi) locale(claws-mail:fr) locale(claws-mail:hu) locale(claws-mail:it) locale(claws-mail:ja) locale(claws-mail:nb) locale(claws-mail:nl) locale(claws-mail:pl) locale(claws-mail:pt_BR) locale(claws-mail:ro) locale(claws-mail:ru) locale(claws-mail:sk) locale(claws-mail:sv) locale(claws-mail:tr) locale(claws-mail:zh_TW)"
RDEPENDS:${PN} += "claws-mail"

inherit rpm
