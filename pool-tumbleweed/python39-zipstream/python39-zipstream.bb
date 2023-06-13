SUMMARY = "Zipfile generator"
DESCRIPTION = "zipstream.py is a ZIP archive generator based on Python 3.3's zipfile.py. \
zipstream can create archives on the fly, which is useful for streaming \
the archive to e.g. web clients without needing to store the archive on \
disk first."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "python39-zipstream-1.1.4-4.12.noarch.rpm"
RPM_HASH = "7523e2d38fd66fc8ce9a54433c9be13dafde70ad7c8aacfc458a5fa77bb98fb6306ead89f238d82cc3ba05a56b83141e5afb71089f3a3108fb6bb25565f1b884"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zipstream) \
python39-zipstream \
python3dist(zipstream)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
