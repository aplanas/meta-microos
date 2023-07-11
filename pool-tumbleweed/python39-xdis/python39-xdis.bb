SUMMARY = "Python cross-version byte-code disassembler and marshal routines"
DESCRIPTION = "Python cross-version byte-code disassembler and marshal routines."
LICENSE = "GPL-2.0-only"

PV = "6.0.5"

RPM_NAME = "python39-xdis-6.0.5-1.4.noarch.rpm"
RPM_HASH = "dd1d1957cd3e2b860f8a94bad8f9ebadc862235e8da9dc9ad81681bd71968919f88de2e8885eb7a0d0eda349998250731af69fd1a2831cc6003d744647727d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xdis \
python39-xdis \
python3dist-xdis"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
