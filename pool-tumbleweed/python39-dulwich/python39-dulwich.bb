SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.21.5"

RPM_NAME = "python39-dulwich-0.21.5-1.1.aarch64.rpm"
RPM_HASH = "4c6bdfec11703372fbaf9b5521ca20852820311b5be40d3e9a49ea380523e513345114ac2eaab732d6dae329f7a9f46a0cb608e159feafbfd6fc6cd688b9e097"

RPROVIDES:${PN} += "python3.9dist(dulwich) \
python39-dulwich \
python39-dulwich(aarch-64) \
python3dist(dulwich)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-urllib3 \
update-alternatives"

inherit rpm
