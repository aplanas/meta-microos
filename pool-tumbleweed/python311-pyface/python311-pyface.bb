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

RPM_NAME = "python311-pyface-7.4.4-1.7.noarch.rpm"
RPM_HASH = "156153d2d92a57eefc755a3580b2d8e2cc336806dce2f731f18e3a5c64d653493c7091b8799a065b2b50cdcd1f53f1839c80b26499b88596a4903468af05cd7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyface \
python3.11dist-pyface \
python311-pyface \
python3dist-pyface"

RDEPENDS:${PN} += "python-abi \
python311-importlib-metadata \
python311-importlib-resources \
python311-traits"

inherit rpm
