SUMMARY = "Mobile"
DESCRIPTION = "Tools designed specifically for laptop computers."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-mobile-20201106-3.5.aarch64.rpm"
RPM_HASH = "f139a97f85cb4da20aefdceab33ca59b018e2709c2f8084afefc76a50455f8401831b16dad97d0e79146eb67ee479eba21b7bde04b8c7d29345a0ee82479be16"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-desktop-mobile \
patterns-desktop-mobile(aarch-64) \
patterns-openSUSE-laptop \
patterns-openSUSE-mobile"

RDEPENDS:${PN} += "pattern()"

inherit rpm
