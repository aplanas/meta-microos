SUMMARY = "Pure-python HTTP server"
DESCRIPTION = "Cheroot is the pure-Python HTTP server used by CherryPy."
LICENSE = "BSD-3-Clause"

PV = "9.0.0"

RPM_NAME = "python39-cheroot-9.0.0-4.3.noarch.rpm"
RPM_HASH = "1bff189462f4141c0eaa800281d2eb5cd0f4dfd9abe295ce5ebd47b6f65a8c564f90b2c5790e76968b0470e715ea3eaa0c34011062ffc7352d5c3f89bcd918df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cheroot \
python39-Cheroot \
python39-cheroot \
python3dist-cheroot"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-jaraco.functools \
python39-more-itertools"

inherit rpm
