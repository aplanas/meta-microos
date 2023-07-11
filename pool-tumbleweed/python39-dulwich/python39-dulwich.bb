SUMMARY = "Pure-Python Git Library"
DESCRIPTION = "Simple Pure-Python implementation of the Git file formats and protocols. Dulwich \
is the place where Mr. and Mrs. Git live in one of the Monty Python sketches."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "0.21.5"

RPM_NAME = "python39-dulwich-0.21.5-1.3.aarch64.rpm"
RPM_HASH = "f913cb603c358cee489168c8d8bce085fad2f38e2974da29b21979f95dc113956c6e0f363f801aa80ceb73c6e2f2d20a21c5f3659d455d9fe342bf813f75e27c"

RPROVIDES:${PN} += "python3.9dist-dulwich \
python39-dulwich \
python3dist-dulwich"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-urllib3 \
update-alternatives"

inherit rpm
