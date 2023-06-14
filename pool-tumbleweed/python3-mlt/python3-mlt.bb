SUMMARY = "Python bindings for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
This package contains python bindings."
LICENSE = "GPL-3.0-or-later"

PV = "7.14.0"

RPM_NAME = "python3-mlt-7.14.0-2.2.aarch64.rpm"
RPM_HASH = "1a672c2cae42bc30f54bc397d61d4bffaf485cd1c07e2f0eecaae9d04dfaaabbb6d23f107901b2416d92fb20f1c7687c90e8b0c0c71f86a5f42cd3cddc97a7da"

RPROVIDES:${PN} += "python3-mlt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libstdc++.so.6 \
python-abi"

inherit rpm
