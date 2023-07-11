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

RPM_NAME = "python39-traitsui-7.2.1-1.8.noarch.rpm"
RPM_HASH = "9e58ef6dc3589f9e1f0b061e742cf84f28e9f0627dc47297cc9363a502207065ef08c9ccc943c511df6835a74e3ea0d41f43daa8920cf734fda6484c0cceaee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-traitsui \
python39-traitsui \
python3dist-traitsui"

RDEPENDS:${PN} += "python-abi \
python39-pyface \
python39-traits"

inherit rpm
