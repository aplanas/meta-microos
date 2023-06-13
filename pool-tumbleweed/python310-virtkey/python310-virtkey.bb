SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0+"

PV = "0.63.0"

RPM_NAME = "python310-virtkey-0.63.0-9.31.aarch64.rpm"
RPM_HASH = "220eceef99044855c30984cd623188ca3dfe7cdfb598bc21ad9e38137798e0f77d9079288c5a740625cb00aef113bcfcb823c83bc96cb4d01c4e1fa806763bab"

RPROVIDES:${PN} += "python3-virtkey \
python3.10dist(virtkey) \
python310-virtkey \
python310-virtkey(aarch-64) \
python3dist(virtkey)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libxkbfile.so.1()(64bit) \
python(abi)"

inherit rpm
