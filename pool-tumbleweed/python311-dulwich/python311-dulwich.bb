SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.21.5"

RPM_NAME = "python311-dulwich-0.21.5-1.1.aarch64.rpm"
RPM_HASH = "f4265377c95a3914b62fe65f7948d439635c9191d621fd85763d85eefd0f5650ce41ccd38d812bcd69411d50f9e6c018c7e2b9020022d5ae3563ea281e353423"

RPROVIDES:${PN} += "python3.11dist-dulwich \
python311-dulwich \
python3dist-dulwich"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-urllib3 \
update-alternatives"

inherit rpm
