SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.9"

RPM_NAME = "python310-duet-0.2.9-1.1.noarch.rpm"
RPM_HASH = "bf02dee238a9d59eefc9d47c80c4c179711ff026c5c2138f794e89cc533c96af3149bc47152dd13e0d0132edc649aa734657ffb92733e6027287b3e891e675d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-duet \
python310-duet \
python3dist-duet"

RDEPENDS:${PN} += "python-abi \
python310-typing-extensions"

inherit rpm
