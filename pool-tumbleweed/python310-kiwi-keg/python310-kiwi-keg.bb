SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python310-kiwi-keg-2.1.1-1.1.noarch.rpm"
RPM_HASH = "3fe7c77e03d8cfebf922e774e3301ed874cb1efd82b889aa8347c86f3b398a21bd89b1d404ec9ea7ca230ac2cc1bcc3bc8dc3eebb7486ccec907710909368357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kiwi-keg \
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
