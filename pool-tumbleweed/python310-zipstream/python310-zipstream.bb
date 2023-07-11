SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python310-zipstream-1.1.4-4.14.noarch.rpm"
RPM_HASH = "d38057f80f3120223e09059299da60547210bfe2dd447f6e7f2e4cf79a905fde0b0aa1db424298b828a040d8db6d7699051f960a73f9453c837d5876bdc49a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zipstream \
python310-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
