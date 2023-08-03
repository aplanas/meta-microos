SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python39-kiwi-keg-2.1.1-1.1.noarch.rpm"
RPM_HASH = "e17a296eaee85a0f74314177f9a7386848ae0b2b984ac24cabc4316f40f35f329e878e10c6bcee40f4da8d321e8042ac63f363170d603a77909e682259dc460b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kiwi-keg \
python39-kiwi-keg \
python3dist-kiwi-keg"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python3-kiwi \
python39-Jinja2 \
python39-PyYAML \
python39-docopt \
python39-schema"

inherit rpm
