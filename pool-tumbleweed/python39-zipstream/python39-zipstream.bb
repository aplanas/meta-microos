SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python39-zipstream-1.1.4-4.14.noarch.rpm"
RPM_HASH = "1fdda0f4f72f900e1b2a2145cac7542967c5c72ad8d26cebd4ffbd33a09214d11d8acf7f7e6371a820d5603c8323c70d5328032974d0185e611deaa3173e713b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zipstream \
python39-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
