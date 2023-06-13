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

RPM_NAME = "python39-pyface-7.4.4-1.5.noarch.rpm"
RPM_HASH = "8cffde6fa23943f24c3747918eec138ae402b92463e147fa1c2cb87aeb077282e81921f59fb0ce95f5548904dce49fc28a2a8985bdbaee2e65a5d8fb81d89ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyface) \
python39-pyface \
python3dist(pyface)"

RDEPENDS:${PN} += "python(abi) \
python39-importlib-metadata \
python39-importlib-resources \
python39-traits"

inherit rpm
