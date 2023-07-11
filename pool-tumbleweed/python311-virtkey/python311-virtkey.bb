SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0+"

PV = "0.63.0"

RPM_NAME = "python311-virtkey-0.63.0-9.32.aarch64.rpm"
RPM_HASH = "17d376af91b7d61e3d254c6f4d888a7fc28bbaac53af14828ca10faf0ae748bcaf3e4ffb4c593fbbd03911a07827e8b1a32304f1812726ec6daba17846cf011f"

RPROVIDES:${PN} += "python3-virtkey \
python3.11dist-virtkey \
python311-virtkey \
python3dist-virtkey"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libxkbfile.so.1 \
python-abi"

inherit rpm
