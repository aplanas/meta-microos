SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "python3-kiwi-keg-2.0.3-1.1.noarch.rpm"
RPM_HASH = "ba1fb402dc47e05768f6fa749a0f20aa896c243deffd390e0cd14da12a3f3fa54927773a872a279150261ac2b5080d774306fd8aaaada69c53999cce1121727d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiwi-keg \
python3.10dist-kiwi-keg \
python3dist-kiwi-keg"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Cerberus \
python3-Jinja2 \
python3-PyYAML \
python3-docopt \
python3-kiwi \
python3-schema \
python3-setuptools"

inherit rpm
