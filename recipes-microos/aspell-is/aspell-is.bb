SUMMARY = "Icelandic (Íslenska) Dictionary for Aspell"
DESCRIPTION = "An Icelandic (Íslenska) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.51.10"

RPM_NAME = "aspell-is-0.51.10-2.14.aarch64.rpm"
RPM_HASH = "aeb1a81b35517bab389717ee10ae9e98618d993f4d56ee257d811c0a84d67d54bffd00effc19f714fe2d850c6061291331373cbd93f80de4632a2c0af1808bd6"

RPROVIDES:${PN} += "aspell-is \
aspell-is(aarch-64) \
locale(aspell:is)"
RDEPENDS:${PN} += ""

inherit rpm
