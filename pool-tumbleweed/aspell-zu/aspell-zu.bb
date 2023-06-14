SUMMARY = "Zulu (isiZulu) Dictionary Package for Aspell"
DESCRIPTION = "A Zulu (isiZulu) dictionary for the aspell spell checker."
LICENSE = "LGPL-2.1-or-later"

PV = "0.50"

RPM_NAME = "aspell-zu-0.50-2.14.aarch64.rpm"
RPM_HASH = "8ff959ed41ead53a5244d5216ed3e47cfd9854ec89204903d5bedcfbd23164c668ffe8eaba04fcd3edac6e5bd156d610415dc891e2f8496d62beff221605821c"

RPROVIDES:${PN} += "aspell-zu \
locale-aspell-zu"

RDEPENDS:${PN} += ""

inherit rpm
