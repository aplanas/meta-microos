SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python311-zipstream-1.1.4-4.14.noarch.rpm"
RPM_HASH = "5438b1d2340f0327d035633264aa2a218d88efb27f99c0e6714584fc1125cac91f176d71a47dea34a8619ce28a353940eb9a3d4720b0253c03910c66c74b4064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zipstream \
python3.11dist-zipstream \
python311-zipstream \
python3dist-zipstream"

RDEPENDS:${PN} += "python-abi"

inherit rpm
