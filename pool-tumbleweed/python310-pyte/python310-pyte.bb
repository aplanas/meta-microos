SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "python310-pyte-0.8.1-1.5.noarch.rpm"
RPM_HASH = "30e664ee18a59255e7ab1d9942f1b6eae2f2d87b18829ff0e27a3ca4265a5f033321c1e01baed41163996b758cc6f4e0f2633d0763c8edb1131745dfa28d5745"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyte \
python310-pyte \
python3dist-pyte"

RDEPENDS:${PN} += "python-abi \
python310-wcwidth"

inherit rpm
