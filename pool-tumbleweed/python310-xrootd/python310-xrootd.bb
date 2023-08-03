SUMMARY = "Python bindings for xrootd"
DESCRIPTION = "This package provides python3 bindings for xrootd."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "python310-xrootd-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "991112bc3bcbd11d5b8ad738c5351882f113abdf8d1a5dc9bbb06262be8a4ab15934ef2346a3e270db06f64c407d6491ae1f8596c630b043b18373285ddf943e"

RPROVIDES:${PN} += "python3.10dist-xrootd \
python310-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "libXrdCl.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
