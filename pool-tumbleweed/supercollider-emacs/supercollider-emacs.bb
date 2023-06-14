SUMMARY = "SuperCollider support for Emacs"
DESCRIPTION = "SuperCollider support for the Emacs text editor."
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-emacs-3.13.0-1.3.aarch64.rpm"
RPM_HASH = "4a213aef90435a8d7888686427172f9bc291f1c4ea29f51ebd0f521c7c4bf8fd0789e5d92a628e0f2e170f5267bb77459193b389afa4e4a0ca7cb42fc171270c"

RPROVIDES:${PN} += "supercollider-emacs"

RDEPENDS:${PN} += "supercollider"

inherit rpm
