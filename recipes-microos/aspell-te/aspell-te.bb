SUMMARY = "Telugu (తెలుగు) Dictionary for Aspell"
DESCRIPTION = "A Telugu (తెలుగు) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.01.2"

RPM_NAME = "aspell-te-0.01.2-2.14.aarch64.rpm"
RPM_HASH = "e1c7dede58d13dbc7de4f7b3f088ab464c824f8ca88d33edd2cfea65659bc9ee7ae4df8c21ce9434c327802cecded57de102e0f36fdf9d0f8a092cb0237f9f87"

RPROVIDES:${PN} += "aspell-te aspell-te(aarch-64) locale(aspell:te)"
RDEPENDS:${PN} += ""

inherit rpm
