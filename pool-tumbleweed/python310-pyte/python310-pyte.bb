SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "python310-pyte-0.8.1-1.3.noarch.rpm"
RPM_HASH = "a5b4a1a61fe3e652680e612fcf8784c0df8af27047dab6943dff8241d269c4cd05428ddf658df941fa57ed1603a93d2e891c601a1eea0652580db577183fc8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyte \
python3.10dist(pyte) \
python310-pyte \
python3dist(pyte)"
RDEPENDS:${PN} += "python(abi) \
python310-wcwidth"

inherit rpm
