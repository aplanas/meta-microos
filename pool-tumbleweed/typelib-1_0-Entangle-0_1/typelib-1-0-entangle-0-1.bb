SUMMARY = "Introspection bindings for the entangle plugins"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the GObject Introspection bindings for entangle \
plugins"
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "typelib-1_0-Entangle-0_1-3.0-2.8.aarch64.rpm"
RPM_HASH = "59621f5cbcd07fa5b2e8ee3b145601bb093503891e6d8519aa9adbf87d2dc4980923e75604dfac5939624402062b4b6a9a97e92ce23723ae2a42e35526b02389"

RPROVIDES:${PN} += "typelib(Entangle) \
typelib-1_0-Entangle-0_1 \
typelib-1_0-Entangle-0_1(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
