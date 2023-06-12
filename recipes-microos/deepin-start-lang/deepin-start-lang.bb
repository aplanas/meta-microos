SUMMARY = "Translations for package deepin-start"
DESCRIPTION = "Provides translations for the 'deepin-start' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "deepin-start-lang-5.9.49-2.4.aarch64.rpm"
RPM_HASH = "4fdfdbd21caab45571d2c11c1f2767f7aa0fe2305c3944a2fa9bd5524cc21cf0dd557dbe18ed6feeedc66dbcb352566d67a598a2f0e578171cee759f792e1b38"

RPROVIDES:${PN} += "deepin-start-lang \
deepin-start-lang(aarch-64)"
RDEPENDS:${PN} += "deepin-start"

inherit rpm
