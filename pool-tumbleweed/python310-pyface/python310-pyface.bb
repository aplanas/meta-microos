SUMMARY = "Traits-capable windowing framework"
DESCRIPTION = "The pyface project contains a toolkit-independent GUI abstraction layer, \
which is used to support the 'visualization' features of the Traits package. \
Thus, you can write code in terms of the Traits API (views, items, editors, \
etc.), and let pyface and your selected toolkit and back-end take care of \
the details of displaying them. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only & LGPL-3.0-only & SUSE-Public-Domain"

PV = "7.4.4"

RPM_NAME = "python310-pyface-7.4.4-1.7.noarch.rpm"
RPM_HASH = "cc0ef02670e69ad18b97d629c047031da3a3d7690e00975bad776f24d90a07ec37f49cebb2e90de4b306fbf6ce639d844ede5fa0977e73cc000c950a85561a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyface \
python310-pyface \
python3dist-pyface"

RDEPENDS:${PN} += "python-abi \
python310-importlib-metadata \
python310-importlib-resources \
python310-traits"

inherit rpm
