SUMMARY = "Arabic (العربية) Dictionary for Aspell"
DESCRIPTION = "An Arabic (العربية) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "aspell-ar-1.2.0-2.14.aarch64.rpm"
RPM_HASH = "da7c2a880cd790275851a8323bd3b056eedcfb014e1b4b220dc7418efcd83bf683b5bc8055c0bd68e7aee2c4326e1d7e864d5c79090ac1bed76d0f6507a9534c"

RPROVIDES:${PN} += "aspell-ar \
aspell-ar(aarch-64) \
locale(aspell:ar)"

RDEPENDS:${PN} += ""

inherit rpm
