SUMMARY = "Common files for Printrun"
DESCRIPTION = "Printrun is a set of G-code sending applications for RepRap. \
This package contains common files."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "Printrun-common-2.0.0~rc7.1599393390.c451359-3.13.aarch64.rpm"
RPM_HASH = "3c918e969162b877da68edc5734827f6d812b1f17f96467cecb69752a3939980cf49bb26f51802c2f4fa50657e7c2f6cd1e6bd5a9acbe23befb10889ac40d3ff"

RPROVIDES:${PN} += "Printrun-common \
python3.11dist-printrun \
python3dist-printrun"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-numpy \
python3-pyglet \
python3-pyserial"

inherit rpm
