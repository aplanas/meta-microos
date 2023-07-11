SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.21.5"

RPM_NAME = "python310-dulwich-0.21.5-1.3.aarch64.rpm"
RPM_HASH = "f2a3f5c9c261eb81f768b40b22d92bcaae847b3f0d5c18a1e1a828bc9e1f97100e48b3d9b85157c12dea90db8e367a24cbddfda83d3f48409908f0d4f7b957ab"

RPROVIDES:${PN} += "python3.10dist-dulwich \
python310-dulwich \
python3dist-dulwich"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-urllib3 \
update-alternatives"

inherit rpm
