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

RPM_NAME = "python39-pyface-7.4.4-1.7.noarch.rpm"
RPM_HASH = "b9ddcbf9f8319cc5fad714e8131c0d03a7c96b383f168bddaec8e781dfde85692fbf9490b5b230e2d4daa3a5c14590becf78525004954eff2983fd248b71f31c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyface \
python39-pyface \
python3dist-pyface"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-importlib-resources \
python39-traits"

inherit rpm
