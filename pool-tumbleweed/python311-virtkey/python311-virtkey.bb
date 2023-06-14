SUMMARY = "Python extension to emulate keypresses"
DESCRIPTION = "python-virtkey is a python extension for emulating keypresses and \
getting the keyboard geometry from the xserver."
LICENSE = "LGPL-3.0+"

PV = "0.63.0"

RPM_NAME = "python311-virtkey-0.63.0-9.31.aarch64.rpm"
RPM_HASH = "88539bbc78184bfc18386ca1816503abf735eb842aa65d4b0b2fe164680dc78044b8e8a8278400eb14d2adccbf2b0f8070236afd4cb607bac116c1c31e905651"

RPROVIDES:${PN} += "python3.11dist-virtkey \
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
