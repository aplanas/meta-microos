SUMMARY = "SuperCollider support for Emacs"
DESCRIPTION = "SuperCollider support for the Emacs text editor."
LICENSE = "GPL-3.0-only"

PV = "3.13.0"

RPM_NAME = "supercollider-emacs-3.13.0-1.4.aarch64.rpm"
RPM_HASH = "d982c82a48be7e6fd86c757534369194880aa3cca8554e9ae30355c4007e49253eadf449c7439510c05c052ce73260dbc4890df9c57e1fc32b0974b60d2a02fb"

RPROVIDES:${PN} += "supercollider-emacs"

RDEPENDS:${PN} += "supercollider"

inherit rpm
