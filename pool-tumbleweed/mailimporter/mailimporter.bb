SUMMARY = "Mail import functionality for KDE PIM applications"
DESCRIPTION = "The mailimporter library is a KDE PIM project to provide a framework \
for importing mail from different formats into Mail User Agents such as \
KMail or Kontact."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "mailimporter-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a5bac42634480b960e1d7cab617535a802a3387690b857def01a8fc9dc57fed34fe53f9e7ebf6bf820be743e4f34ca9ca44a1f6d9e2d03127e4c81e30aad075b"

RPROVIDES:${PN} += "mailimporter \
mailimporter(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
