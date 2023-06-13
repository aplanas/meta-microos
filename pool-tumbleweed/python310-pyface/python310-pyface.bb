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

RPM_NAME = "python310-pyface-7.4.4-1.5.noarch.rpm"
RPM_HASH = "b7c0a21942faa4e219984b0c9507ef92a6ac9fbc789b33c04e3648203025a53148d9124c3c40306b64042b7a34b33451e8466a730ed998528b79de0e6ef95fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyface \
python3.10dist(pyface) \
python310-pyface \
python3dist(pyface)"

RDEPENDS:${PN} += "python(abi) \
python310-importlib-metadata \
python310-importlib-resources \
python310-traits"

inherit rpm
