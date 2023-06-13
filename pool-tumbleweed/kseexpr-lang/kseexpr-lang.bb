SUMMARY = "Translations for package kseexpr"
DESCRIPTION = "Provides translations for the 'kseexpr' package."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "kseexpr-lang-4.0.4.0-1.10.noarch.rpm"
RPM_HASH = "90e0f69b9ede349916591943c7e5cf52a4836d4b69f836d699d512164a08c74c3f45db3f7f6e65c75775ee355746cf46e9f7551f3de0e15da06079e2f02f9cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kseexpr-lang \
kseexpr-lang-all \
locale(kseexpr:ca) \
locale(kseexpr:ca@valencia) \
locale(kseexpr:cs) \
locale(kseexpr:de) \
locale(kseexpr:en_GB) \
locale(kseexpr:es) \
locale(kseexpr:fr) \
locale(kseexpr:it) \
locale(kseexpr:ja) \
locale(kseexpr:ko) \
locale(kseexpr:lt) \
locale(kseexpr:nl) \
locale(kseexpr:nn) \
locale(kseexpr:pl) \
locale(kseexpr:pt) \
locale(kseexpr:pt_BR) \
locale(kseexpr:ru) \
locale(kseexpr:sk) \
locale(kseexpr:sl) \
locale(kseexpr:sv) \
locale(kseexpr:uk) \
locale(kseexpr:zh_CN) \
locale(kseexpr:zh_TW)"

RDEPENDS:${PN} += "kseexpr"

inherit rpm
