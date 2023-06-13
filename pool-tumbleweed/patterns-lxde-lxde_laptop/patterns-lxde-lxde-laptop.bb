SUMMARY = "LXDE Laptop"
DESCRIPTION = "LXDE Tools designed specifically for use with laptop computers."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-lxde-lxde_laptop-20170319-3.5.aarch64.rpm"
RPM_HASH = "b385ade9f30014a0c5d2b9edee19c5f6d643b5944459f48caa9e5810880dbc88bad82ff00343c6ab79ebbbb46ff32e084882524ed96f19af88faa31cec1f8abf"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-lxde-lxde_laptop \
patterns-lxde-lxde_laptop(aarch-64)"

RDEPENDS:${PN} += "pattern()"

inherit rpm
