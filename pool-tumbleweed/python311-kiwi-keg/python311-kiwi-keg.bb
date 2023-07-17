SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python311-kiwi-keg-2.1.0-1.1.noarch.rpm"
RPM_HASH = "c667ffd4ce0aa1ed4e3f3f6cd4da6ea81ff3676379f2112a4810dcfdc014e47b279836854ad8185d28932ebcfbd1a3b6c747192e3d3c404dd630fd3bb4531633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiwi-keg \
python3.11dist-kiwi-keg \
python311-kiwi-keg \
python3dist-kiwi-keg"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python3-kiwi \
python311-Jinja2 \
python311-PyYAML \
python311-docopt \
python311-schema"

inherit rpm
