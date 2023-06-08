SUMMARY = "Quechua (Runasimi (qheshwa)) Dictionary for Aspell"
DESCRIPTION = "A Quechua (Runasimi (qheshwa)) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.02"

RPM_NAME = "aspell-qu-0.02-2.14.aarch64.rpm"
RPM_HASH = "211381cf2353262e4f37b4ba5dc74c4e273965806f19f17ae867fe36abdfc935a30acf4f46ab0a84a665cc9f3c0dede40ced2bb3640bdf5c8c44c40172fc20df"

RPROVIDES:${PN} += "aspell-qu aspell-qu(aarch-64) locale(aspell:qu)"
RDEPENDS:${PN} += ""

inherit rpm
