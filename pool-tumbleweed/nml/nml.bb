SUMMARY = "NewGRF Meta Language"
DESCRIPTION = "A tool to compile nml files to grf or nfo files, making newgrf coding easier."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "nml-0.7.4-1.1.aarch64.rpm"
RPM_HASH = "ee11deee309479a1f766fe57c5dbc355eda47bf1e50d6bfabc7ec162c3db62e4e467a879ac2f5d60764077330fbe8a6ed6c415e0658791ef1df2bac7acdef6c4"

RPROVIDES:${PN} += "nml \
nmlc \
python3.11dist-nml \
python3dist-nml"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-Pillow \
python3-ply"

inherit rpm
