SUMMARY = "Dictionary files for libime"
DESCRIPTION = "This package provides dictionary files for libime."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libime-dicts-1.1.1-1.1.aarch64.rpm"
RPM_HASH = "95dfea77bf1ad759f784f67b26f0491aa8e3b8d733d1df39e440a40710cb0b0c14cfb1c30a916f3f8ee061218975587a2cc4aa0f05c4e5aac7f2e481aad7ce43"

RPROVIDES:${PN} += "libime-dicts"

RDEPENDS:${PN} += ""

inherit rpm
