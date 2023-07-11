SUMMARY = "VTXXX-compatible linux terminal emulator"
DESCRIPTION = "An in-memory VTXXX-compatible terminal emulator supporting VT100 and \
other DEC VTs between 1970 and 1995. pyte can be used to: \
 \
* screen scrape terminal apps, for example htop or aptitude. \
* write terminal emulators; either with a graphical (xterm, rxvt) \
  or a web interface, like AjaxTerm."
LICENSE = "LGPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "python311-pyte-0.8.1-1.5.noarch.rpm"
RPM_HASH = "05fb4f4d7ef18299bacad11cc3ddc88714e971de42a2ccc7ffd125277f933eab3ca13cc1d973ac10e8b5c291b9fab0918126057a1a2abfe106a1176f980e0513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyte \
python3.11dist-pyte \
python311-pyte \
python3dist-pyte"

RDEPENDS:${PN} += "python-abi \
python311-wcwidth"

inherit rpm
