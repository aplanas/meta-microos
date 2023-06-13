SUMMARY = "Translations for package clapper"
DESCRIPTION = "Provides translations for the 'clapper' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "clapper-lang-0.5.2-1.3.noarch.rpm"
RPM_HASH = "a2f7d06fd5d8acfb334877c757b01065d2d0294590fe559e6404e430abb93da352f341e7ad3272471bdcfe26337a5d9fe430e51ae366cbf51df594b00f16f80d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clapper-lang \
clapper-lang-all \
locale(clapper:ar) \
locale(clapper:ca) \
locale(clapper:cs) \
locale(clapper:de) \
locale(clapper:es) \
locale(clapper:eu) \
locale(clapper:fr) \
locale(clapper:he) \
locale(clapper:hu) \
locale(clapper:it) \
locale(clapper:ja) \
locale(clapper:nl) \
locale(clapper:pl) \
locale(clapper:pt) \
locale(clapper:pt_BR) \
locale(clapper:ru) \
locale(clapper:sv) \
locale(clapper:tr) \
locale(clapper:zh_CN)"

RDEPENDS:${PN} += "clapper"

inherit rpm
