SUMMARY = "Translations for package dnf-plugins-core"
DESCRIPTION = "Provides translations for the 'dnf-plugins-core' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "dnf-plugins-core-lang-4.3.1-2.1.noarch.rpm"
RPM_HASH = "bc1506194854dc488f9c8e556b8fffc83acaa0194543fa30c217044136860601c91a37d24ed3f08933fd3fd8bf0a6ba8c16fa6360e1a3e1f01170b785f8722c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugins-core-lang \
dnf-plugins-core-lang-all \
locale(dnf-plugins-core:bg) \
locale(dnf-plugins-core:ca) \
locale(dnf-plugins-core:cs) \
locale(dnf-plugins-core:da) \
locale(dnf-plugins-core:de) \
locale(dnf-plugins-core:es) \
locale(dnf-plugins-core:eu) \
locale(dnf-plugins-core:fi) \
locale(dnf-plugins-core:fr) \
locale(dnf-plugins-core:fur) \
locale(dnf-plugins-core:hu) \
locale(dnf-plugins-core:id) \
locale(dnf-plugins-core:it) \
locale(dnf-plugins-core:ja) \
locale(dnf-plugins-core:ka) \
locale(dnf-plugins-core:ko) \
locale(dnf-plugins-core:mr) \
locale(dnf-plugins-core:nl) \
locale(dnf-plugins-core:pa) \
locale(dnf-plugins-core:pl) \
locale(dnf-plugins-core:pt) \
locale(dnf-plugins-core:pt_BR) \
locale(dnf-plugins-core:ru) \
locale(dnf-plugins-core:si) \
locale(dnf-plugins-core:sk) \
locale(dnf-plugins-core:sq) \
locale(dnf-plugins-core:sr) \
locale(dnf-plugins-core:sv) \
locale(dnf-plugins-core:tr) \
locale(dnf-plugins-core:uk) \
locale(dnf-plugins-core:zh_CN) \
locale(dnf-plugins-core:zh_TW)"

RDEPENDS:${PN} += "dnf-plugins-core"

inherit rpm
