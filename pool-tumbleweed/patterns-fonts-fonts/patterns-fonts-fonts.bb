SUMMARY = "Fonts"
DESCRIPTION = "Base fonts and font configuration."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-fonts-fonts-20170319-10.1.aarch64.rpm"
RPM_HASH = "35038194cc854939db497abca04fb15d1cb97d44b07e33fc3af095c871ea2a120adb9ab0e705d6d875e831241d9b12c9d5ed7ee042d95129da8b4b767f5aeb98"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-fonts-fonts \
patterns-fonts-fonts(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
