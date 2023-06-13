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

RPM_NAME = "python311-pyface-7.4.4-1.5.noarch.rpm"
RPM_HASH = "7155059c42d31f3e999f2a23429f73c7cf11f362eb070a45aa2c88b914294bf465e8ac73deff9c1e64598fb4bcbafe5e33eee4fdb14d8bf181a5ca095869e1a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyface) \
python311-pyface \
python3dist(pyface)"

RDEPENDS:${PN} += "python(abi) \
python311-importlib-metadata \
python311-importlib-resources \
python311-traits"

inherit rpm
