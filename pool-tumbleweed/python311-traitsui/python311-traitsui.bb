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

RPM_NAME = "python311-traitsui-7.2.1-1.6.noarch.rpm"
RPM_HASH = "092f2df6a8afdcbdff006ad6a6f9297bc895d24b08c1e08c67bbb6ee116b255e831d02c22279b210dbc36fc9790ebcc88acbcadad89cc4d3569543cf79ce7a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-traitsui \
python311-traitsui \
python3dist-traitsui"

RDEPENDS:${PN} += "python-abi \
python311-pyface \
python311-traits"

inherit rpm
