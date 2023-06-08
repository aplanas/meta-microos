SUMMARY = "Translations for package dolphin-emu"
DESCRIPTION = "Provides translations for the 'dolphin-emu' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.17995"

RPM_NAME = "dolphin-emu-lang-5.0.17995-3.1.noarch.rpm"
RPM_HASH = "6db0a606d978e7c40c80020dec8dbfaeb8a66f9c26bda271adfd700364dee78b287bf54cb93dd4a4809ceb81a9c170f4b04b235f48182810b1e88a0349139831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-emu-lang dolphin-emu-lang-all locale(dolphin-emu:ar) locale(dolphin-emu:ca) locale(dolphin-emu:cs) locale(dolphin-emu:da) locale(dolphin-emu:de) locale(dolphin-emu:el) locale(dolphin-emu:en) locale(dolphin-emu:es) locale(dolphin-emu:fa) locale(dolphin-emu:fr) locale(dolphin-emu:hr) locale(dolphin-emu:hu) locale(dolphin-emu:it) locale(dolphin-emu:ja) locale(dolphin-emu:ko) locale(dolphin-emu:ms) locale(dolphin-emu:nb) locale(dolphin-emu:nl) locale(dolphin-emu:pl) locale(dolphin-emu:pt) locale(dolphin-emu:pt_BR) locale(dolphin-emu:ro) locale(dolphin-emu:ru) locale(dolphin-emu:sr) locale(dolphin-emu:sv) locale(dolphin-emu:tr) locale(dolphin-emu:zh_CN) locale(dolphin-emu:zh_TW)"
RDEPENDS:${PN} += "dolphin-emu"

inherit rpm
