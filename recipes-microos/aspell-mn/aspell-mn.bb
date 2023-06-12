SUMMARY = "Mongolian (Монгол) Dictionary for Aspell"
DESCRIPTION = "A Mongolian (Монгол) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "0.06.2"

RPM_NAME = "aspell-mn-0.06.2-2.14.aarch64.rpm"
RPM_HASH = "25c1a5e2a01c7ed36c6ef49e4356010d599526d66b35bbff8bffa2b624b3540790ace0aad464108c4c978d19d98a4dee490609a08799c69970ce595a06a0bc2e"

RPROVIDES:${PN} += "aspell-mn \
aspell-mn(aarch-64) \
locale(aspell:mn)"
RDEPENDS:${PN} += ""

inherit rpm
