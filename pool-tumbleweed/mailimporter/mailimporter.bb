SUMMARY = "Mail import functionality for KDE PIM applications"
DESCRIPTION = "The mailimporter library is a KDE PIM project to provide a framework \
for importing mail from different formats into Mail User Agents such as \
KMail or Kontact."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "mailimporter-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3c08ff5f8c01c7d1546fd003b8904a994d4c63a96132582eea0dbb17e046c73894d26a6e0300646e29e336643ddb82c4de77989a2c8193526a1c1bb8ec4eb0d4"

RPROVIDES:${PN} += "mailimporter"

RDEPENDS:${PN} += ""

inherit rpm
