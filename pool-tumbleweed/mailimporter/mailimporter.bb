SUMMARY = "Mail import functionality for KDE PIM applications"
DESCRIPTION = "The mailimporter library is a KDE PIM project to provide a framework \
for importing mail from different formats into Mail User Agents such as \
KMail or Kontact."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "mailimporter-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a65d8828a92524fb175eb41ecd66f395aaca79b6b2fb2a2167965fd1db196f49810b232ee68786b3ee64869b42a102ee15938024093f3f8ce8736af8c04043a9"

RPROVIDES:${PN} += "mailimporter"

RDEPENDS:${PN} += ""

inherit rpm
