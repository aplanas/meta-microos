SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-misaka-2.1.1-2.19.aarch64.rpm"
RPM_HASH = "e1d476dbe4d4e30135967890f03942e11be40a0d0081d124d9bf530f9da5ef7d07895e9a82bba8b64794e4927298e0fab438b6a6d68d942f2e50f489600820c9"

RPROVIDES:${PN} += "python3.10dist-misaka \
python310-misaka \
python3dist-misaka"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-cffi \
update-alternatives"

inherit rpm
