SUMMARY = "Translations for package help2man"
DESCRIPTION = "Provides translations for the 'help2man' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.49.3"

RPM_NAME = "help2man-lang-1.49.3-1.3.noarch.rpm"
RPM_HASH = "f1f919fc424938dc3233bb15278bc3a0d0fa31789a5a2b8df3fd1afba20ef7c4f39591d84d6e0cc362eb02c52d3121c5f1b1046c8980faf490bd9e3fae12eeda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "help2man-lang \
help2man-lang-all \
locale(help2man:da) \
locale(help2man:de) \
locale(help2man:el) \
locale(help2man:eo) \
locale(help2man:es) \
locale(help2man:fi) \
locale(help2man:fr) \
locale(help2man:hr) \
locale(help2man:hu) \
locale(help2man:it) \
locale(help2man:ja) \
locale(help2man:ko) \
locale(help2man:nb) \
locale(help2man:pl) \
locale(help2man:pt_BR) \
locale(help2man:ro) \
locale(help2man:ru) \
locale(help2man:sr) \
locale(help2man:sv) \
locale(help2man:ta) \
locale(help2man:uk) \
locale(help2man:vi) \
locale(help2man:zh_CN)"

RDEPENDS:${PN} += "help2man"

inherit rpm
