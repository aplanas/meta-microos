SUMMARY = "Python bindings for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
This package contains python bindings."
LICENSE = "GPL-3.0-or-later"

PV = "7.16.0"

RPM_NAME = "python3-mlt-7.16.0-1.2.aarch64.rpm"
RPM_HASH = "09b89570d251858903287aece84aa2421d74deb0f274d4496cdcaf4deb6aa619c9281a7a84bd5a657384e1994bf6450a4da6bf422ca769fdbb6a94358a3c5c19"

RPROVIDES:${PN} += "python3-mlt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libstdc++.so.6 \
python-abi"

inherit rpm
