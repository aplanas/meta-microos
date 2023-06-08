SUMMARY = "Translations for package exaile"
DESCRIPTION = "Provides translations for the 'exaile' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "exaile-lang-4.1.1-1.6.noarch.rpm"
RPM_HASH = "81b0bb206d4bc5b3f5a3f493528fc34eb9b5151227efaecfd6fced12de21cb10693391254d8fa6dc9b4c887f94d934ca2a44e09eea0248f7a72b56cc6380f856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exaile-lang exaile-lang-all locale(exaile:af) locale(exaile:ar) locale(exaile:ast) locale(exaile:az) locale(exaile:be) locale(exaile:be@latin) locale(exaile:bg) locale(exaile:bn) locale(exaile:bs) locale(exaile:ca) locale(exaile:cs) locale(exaile:cy) locale(exaile:da) locale(exaile:de) locale(exaile:el) locale(exaile:en_AU) locale(exaile:en_CA) locale(exaile:en_GB) locale(exaile:eo) locale(exaile:es) locale(exaile:et) locale(exaile:eu) locale(exaile:fa) locale(exaile:fi) locale(exaile:fr) locale(exaile:gl) locale(exaile:gu) locale(exaile:he) locale(exaile:hi) locale(exaile:hr) locale(exaile:hu) locale(exaile:id) locale(exaile:it) locale(exaile:ja) locale(exaile:ka) locale(exaile:kk) locale(exaile:ko) locale(exaile:lt) locale(exaile:lv) locale(exaile:mk) locale(exaile:ml) locale(exaile:mr) locale(exaile:ms) locale(exaile:nb) locale(exaile:nl) locale(exaile:oc) locale(exaile:pl) locale(exaile:pt) locale(exaile:pt_BR) locale(exaile:ro) locale(exaile:ru) locale(exaile:si) locale(exaile:sk) locale(exaile:sl) locale(exaile:sq) locale(exaile:sr) locale(exaile:sv) locale(exaile:ta) locale(exaile:te) locale(exaile:th) locale(exaile:tr) locale(exaile:uk) locale(exaile:vi) locale(exaile:zh) locale(exaile:zh_CN) locale(exaile:zh_TW)"
RDEPENDS:${PN} += "exaile"

inherit rpm
