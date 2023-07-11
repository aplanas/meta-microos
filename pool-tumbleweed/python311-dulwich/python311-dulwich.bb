SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.21.5"

RPM_NAME = "python311-dulwich-0.21.5-1.3.aarch64.rpm"
RPM_HASH = "8d615e15b5f3e4354f94a22f74db17b646a9e75d366c2c767230756821975e3982815a210624ecbd912bf95fe6f5d3dbebb385cf98a3db1d0d6b3501e3d221b5"

RPROVIDES:${PN} += "python3-dulwich \
python3.11dist-dulwich \
python311-dulwich \
python3dist-dulwich"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-urllib3 \
update-alternatives"

inherit rpm
