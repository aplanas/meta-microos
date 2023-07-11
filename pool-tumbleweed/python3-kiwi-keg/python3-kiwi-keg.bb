SUMMARY = "KEG - Image Composition Tool"
DESCRIPTION = "KEG is an image composition tool for KIWI image descriptions"
LICENSE = "GPL-3.0-or-later"

PV = "2.0.3"

RPM_NAME = "python3-kiwi-keg-2.0.3-1.2.noarch.rpm"
RPM_HASH = "ff32a2e011dcbf89f4d94245f0708a9034405d35c630e5167a49226acba606a6fb13d27b4321fc25d79e214b022b0c35628de77b6c8b722dc45d12bb2b1f8023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kiwi-keg \
python3.11dist-kiwi-keg \
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
