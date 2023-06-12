SUMMARY = "Translations for package caja-extension-terminal"
DESCRIPTION = "Provides translations for the 'caja-extension-terminal' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "caja-extension-terminal-lang-0.10-3.6.noarch.rpm"
RPM_HASH = "cd7f727c30cc69a1c9bcfef1532121e3f4dcf75dc69658792142d4f4d65cc274a4aed1ac1f9a1a036a3096f5629171eb43ce3ebc9f9f3d76620a6613c7679558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-terminal-lang \
caja-extension-terminal-lang-all \
locale(caja-extension-terminal:bg) \
locale(caja-extension-terminal:ca) \
locale(caja-extension-terminal:cs) \
locale(caja-extension-terminal:de) \
locale(caja-extension-terminal:es) \
locale(caja-extension-terminal:fr) \
locale(caja-extension-terminal:he) \
locale(caja-extension-terminal:hu) \
locale(caja-extension-terminal:it) \
locale(caja-extension-terminal:lv) \
locale(caja-extension-terminal:nb) \
locale(caja-extension-terminal:nl) \
locale(caja-extension-terminal:pl) \
locale(caja-extension-terminal:pt) \
locale(caja-extension-terminal:pt_BR) \
locale(caja-extension-terminal:ro) \
locale(caja-extension-terminal:ru) \
locale(caja-extension-terminal:sv) \
locale(caja-extension-terminal:tr)"
RDEPENDS:${PN} += "caja-extension-terminal"

inherit rpm
