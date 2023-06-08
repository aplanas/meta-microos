SUMMARY = "Slovak (slovenský) Dictionary for Aspell"
DESCRIPTION = "A Slovak (slovenský) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-only | LGPL-2.1-only | MPL-1.1"

PV = "2.01"

RPM_NAME = "aspell-sk-2.01-2.14.aarch64.rpm"
RPM_HASH = "6fafef68b8465fd97847134a51ae671250c224d93b66bcca4727498dc5bcddc433be13811de4c0f69a5a21d5f4cbe2f412620674a64fa82dce830bd1e29f909b"

RPROVIDES:${PN} += "aspell-sk aspell-sk(aarch-64) locale(aspell:sk)"
RDEPENDS:${PN} += ""

inherit rpm
