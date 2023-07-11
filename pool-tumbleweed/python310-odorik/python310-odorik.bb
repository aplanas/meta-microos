SUMMARY = "Python module for Odorik API"
DESCRIPTION = "Python module to work with Odorik API."
LICENSE = "GPL-3.0-or-later"

PV = "0.5"

RPM_NAME = "python310-odorik-0.5-6.6.noarch.rpm"
RPM_HASH = "9a239ebfee595f92b0df9c2e6f420fac2853b6eab10258aeddd6d04f8a987474af5d3b0164a0b87c2288a9b834924b5548ceb1b435ac4aca996a028388b5a2b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-odorik \
python310-odorik \
python3dist-odorik"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-xdg \
update-alternatives"

inherit rpm
