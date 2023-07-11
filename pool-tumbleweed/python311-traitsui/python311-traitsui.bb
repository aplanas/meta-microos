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

RPM_NAME = "python311-traitsui-7.2.1-1.8.noarch.rpm"
RPM_HASH = "ad5ffe455c90aef98e080654677540340060318192d11a57301bbeb3625930c9bc9f56272f42b06275c2e063e99370f11b37d8b2b59c2b7093b8da91f068ccbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traitsui \
python3.11dist-traitsui \
python311-traitsui \
python3dist-traitsui"

RDEPENDS:${PN} += "python-abi \
python311-pyface \
python311-traits"

inherit rpm
