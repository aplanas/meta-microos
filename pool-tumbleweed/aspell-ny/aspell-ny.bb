SUMMARY = "Chichewa Dictionary for Aspell"
DESCRIPTION = "A Chichewa dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01"

RPM_NAME = "aspell-ny-0.01-2.14.aarch64.rpm"
RPM_HASH = "6834fa0aff99bb54b4e1df2e6bae729dc0febe029841d15ef03fdb00a0a023bcd95eb78e0f119d7a7d4945c5560cd171bd12014aed5901b69ea5c4f9a92bdd89"

RPROVIDES:${PN} += "aspell-ny \
aspell-ny(aarch-64) \
locale(aspell:ny)"

RDEPENDS:${PN} += ""

inherit rpm
