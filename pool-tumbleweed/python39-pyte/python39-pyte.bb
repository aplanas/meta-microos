SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "python39-pyte-0.8.1-1.5.noarch.rpm"
RPM_HASH = "0cb1467d9711fb056470c62ee47f10e9b6d1f98896e283e60fbdfcabc50acc13b470fe8717ae12308e133cdb9eb004cde2b344c90afd2e9493f488249f52a96a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyte \
python39-pyte \
python3dist-pyte"

RDEPENDS:${PN} += "python-abi \
python39-wcwidth"

inherit rpm
