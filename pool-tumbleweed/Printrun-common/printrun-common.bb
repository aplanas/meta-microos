SUMMARY = "Common files for Printrun"
DESCRIPTION = "Printrun is a set of G-code sending applications for RepRap. \
This package contains common files."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0~rc7.1599393390.c451359"

RPM_NAME = "Printrun-common-2.0.0~rc7.1599393390.c451359-3.12.aarch64.rpm"
RPM_HASH = "ed7c659ea8f3428c20b58a4f57b6c0fa671cd3db37704e415d0e7745c256dbdfd3756312465b5faa28868098a5c35ac274ea61294f4d3a0ffa88d01ec51f5e58"

RPROVIDES:${PN} += "Printrun-common \
python3.10dist-printrun \
python3dist-printrun"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-numpy \
python3-pyglet \
python3-pyserial"

inherit rpm
