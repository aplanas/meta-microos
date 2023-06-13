SUMMARY = "Translations for package console"
DESCRIPTION = "Provides translations for the 'console' package."
LICENSE = "GPL-3.0-only"

PV = "44.0"

RPM_NAME = "console-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "4e6ed6e098d3b6f9b0bb3359cc9bf5dda19859a68201df6e8532aae7060ec2ad94d2ffa2a9b646542894f182aa9a976bd0b5633162001d3055b1ad8fafe7b235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "console-lang \
console-lang-all \
locale(console:be) \
locale(console:bg) \
locale(console:ca) \
locale(console:cs) \
locale(console:da) \
locale(console:de) \
locale(console:el) \
locale(console:en_GB) \
locale(console:es) \
locale(console:eu) \
locale(console:fa) \
locale(console:fi) \
locale(console:fr) \
locale(console:fur) \
locale(console:gl) \
locale(console:he) \
locale(console:hi) \
locale(console:hr) \
locale(console:hu) \
locale(console:id) \
locale(console:it) \
locale(console:ja) \
locale(console:ka) \
locale(console:kk) \
locale(console:ko) \
locale(console:lt) \
locale(console:lv) \
locale(console:nb) \
locale(console:ne) \
locale(console:nl) \
locale(console:oc) \
locale(console:pa) \
locale(console:pl) \
locale(console:pt) \
locale(console:pt_BR) \
locale(console:ro) \
locale(console:ru) \
locale(console:sk) \
locale(console:sl) \
locale(console:sr) \
locale(console:sv) \
locale(console:tr) \
locale(console:uk) \
locale(console:vi) \
locale(console:zh_CN) \
locale(console:zh_TW)"

RDEPENDS:${PN} += "console"

inherit rpm
