SUMMARY = "A Python interface to the SANE scanner and frame grabber interface"
DESCRIPTION = "The SANE module provides an interface to the SANE scanner and frame grabber interface for Linux.  This module has been split out from Pillow since version 2.7.0."
LICENSE = "NTP"

PV = "2.9.1"

RPM_NAME = "python310-sane-2.9.1-1.13.aarch64.rpm"
RPM_HASH = "fea5e246fe8d1fc3eaf6bc3417f63783285df1a6317bf160914563d717722fd37cd9b69b4684ecfcd4b24bd6a7d72a7950b2807a7f5f691ccc15595b3ff49fa3"

RPROVIDES:${PN} += "python3.10dist-python-sane \
python310-sane \
python3dist-python-sane"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1 \
python-abi"

inherit rpm
