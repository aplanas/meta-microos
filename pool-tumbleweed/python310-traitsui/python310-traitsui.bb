SUMMARY = "Traits-capable windowing framework"
DESCRIPTION = "The TraitsGUI project contains a toolkit-independent GUI abstraction layer \
(known as Pyface), which is used to support the 'visualization' features of \
the Traits package. Thus, you can write code in terms of the Traits API \
(views, items, editors, etc.), and let TraitsGUI and your selected toolkit \
and back-end take care of the details of displaying them. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only & LGPL-3.0-only"

PV = "7.2.1"

RPM_NAME = "python310-traitsui-7.2.1-1.6.noarch.rpm"
RPM_HASH = "ae2cc3bfe58ae844504f718757ff321b2fde3e943261e1ac1148ee76553ae954e54c8e4f19d82441621f6b2512ee5d96e736515a34c871b029617f23a789b14c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traitsui \
python3.10dist(traitsui) \
python310-traitsui \
python3dist(traitsui)"
RDEPENDS:${PN} += "python(abi) \
python310-pyface \
python310-traits"

inherit rpm
