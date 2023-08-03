SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python311-kiwi-keg-2.1.1-1.1.noarch.rpm"
RPM_HASH = "dc4b6a42518bebb046c647653cd8ebac5a1b726fefcc7e90c1b1e7246984c06e15f7c5376c946ebe706edbd38d4f0444cdfba3a935b4939bb82ad75dedee15fb"
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
