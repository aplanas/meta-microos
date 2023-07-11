SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python39-watchfiles-0.19.0-1.2.aarch64.rpm"
RPM_HASH = "887cf86820c1ea15db4ec7461e4d57ac1ae4e18afc8d5551dee75ea02602de64cd76ca9b676dfae25f346892af2a2ad9ea0d8ddf2ab66dcc9ada0c1d2dc731f4"

RPROVIDES:${PN} += "python3.9dist-watchfiles \
python39-watchfiles \
python3dist-watchfiles"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python39-anyio \
update-alternatives"

inherit rpm
