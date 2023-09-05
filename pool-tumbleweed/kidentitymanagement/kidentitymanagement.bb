SUMMARY = "KDE PIM Libraries: Identity Management"
DESCRIPTION = "This package provides a library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kidentitymanagement-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f8115e94884ebdc715656754e2232fd9f27a7f8228c728129766bdddbf652078e087ec974b0af493fcf248b8f929e0ab4df4ce7af9b05123b211db285c7eb923"

RPROVIDES:${PN} += "kidentitymanagement"

RDEPENDS:${PN} += ""

inherit rpm
