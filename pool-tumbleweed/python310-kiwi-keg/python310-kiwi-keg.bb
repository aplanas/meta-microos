SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "python310-kiwi-keg-2.1.0-1.1.noarch.rpm"
RPM_HASH = "b39ad2b16a9843079d04b9518a6bdc8ecac648bba64de4564a125c8a2f79574fdac2ebf991bf5a784a8bcbaddd0131f7bb5ed6b1a0a99a71df6bd0353fe0ae84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiwi-keg \
python3.10dist-kiwi-keg \
python310-kiwi-keg \
python3dist-kiwi-keg"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python3-kiwi \
python310-Jinja2 \
python310-PyYAML \
python310-docopt \
python310-schema"

inherit rpm
