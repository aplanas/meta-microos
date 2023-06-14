SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python311-zipstream-1.1.4-4.12.noarch.rpm"
RPM_HASH = "34b1b377ce920b4aed6b68f60a6d531cad883c67f163559a4cded6472108d4c0939b9e8c49edd86b5ffa8651bf9071c0f83c81a5d7b119adb9a0ead2ab0c65b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zipstream \
python311-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
