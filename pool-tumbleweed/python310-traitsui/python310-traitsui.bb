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

RPM_NAME = "python310-traitsui-7.2.1-1.8.noarch.rpm"
RPM_HASH = "938bda5a839f3b280557c7809bffdb2b4f4c0870f4a96eb1b1e82c1da8a255d865e88b2cdb32046722384f4978a584f919d261548b01e828784b4c0926099283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-traitsui \
python310-traitsui \
python3dist-traitsui"

RDEPENDS:${PN} += "python-abi \
python310-pyface \
python310-traits"

inherit rpm
