SUMMARY = "Translations for package bash"
DESCRIPTION = "Provides translations for the 'bash' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-lang-5.2.15-8.3.noarch.rpm"
RPM_HASH = "4686431880a106d69f32cb5c69571f426921eaf881a653c19cf669674cd9da1b305736f9223cd0c6b72bb237141e251c5d4d9f61c4c34f445a51337eb4267074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-lang bash-lang-all locale(bash:af) locale(bash:bg) locale(bash:ca) locale(bash:cs) locale(bash:da) locale(bash:de) locale(bash:el) locale(bash:en@boldquot) locale(bash:en@quot) locale(bash:eo) locale(bash:es) locale(bash:et) locale(bash:fi) locale(bash:fr) locale(bash:ga) locale(bash:gl) locale(bash:hr) locale(bash:hu) locale(bash:id) locale(bash:it) locale(bash:ja) locale(bash:ko) locale(bash:lt) locale(bash:nb) locale(bash:nl) locale(bash:pl) locale(bash:pt) locale(bash:pt_BR) locale(bash:ro) locale(bash:ru) locale(bash:sk) locale(bash:sl) locale(bash:sr) locale(bash:sv) locale(bash:tr) locale(bash:uk) locale(bash:vi) locale(bash:zh_CN) locale(bash:zh_TW)"
RDEPENDS:${PN} += "bash"

inherit rpm
