SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0+"

PV = "0.63.0"

RPM_NAME = "python310-virtkey-0.63.0-9.32.aarch64.rpm"
RPM_HASH = "d131a5b4b3aa2dee401065049638c6737c68b581e9186403b398f17c3b9307553d19537ac72def85ab7f90b4cdccbac38ff026494a44ef0fd79e38c7e439b52e"

RPROVIDES:${PN} += "python3.10dist-virtkey \
python310-virtkey \
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
